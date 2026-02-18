package onix.manager;

import lombok.Getter;
import onix.client.draggables.HudManager;
import onix.command.CommandManager;
import onix.events.api.EventManager;
import onix.modules.impl.combat.aura.attack.StrikerConstructor;
import onix.modules.module.*;
import onix.screens.clickgui.ClickGui;
import onix.util.config.ConfigSystem;
import onix.util.config.impl.bind.BindConfig;
import onix.util.config.impl.blockesp.BlockESPConfig;
import onix.util.config.impl.drag.DragConfig;
import onix.util.config.impl.friend.FriendConfig;
import onix.util.config.impl.prefix.PrefixConfig;
import onix.util.config.impl.proxy.ProxyConfig;
import onix.util.config.impl.staff.StaffConfig;
import onix.util.modules.ModuleProvider;
import onix.util.modules.ModuleSwitcher;
import onix.util.render.shader.RenderCore;
import onix.util.render.shader.Scissor;
import onix.util.render.font.FontInitializer;
import onix.util.repository.macro.MacroRepository;
import onix.util.repository.way.WayRepository;
import onix.util.tps.TPSCalculate;



@Getter
public class Manager {
    public StrikerConstructor attackPerpetrator = new StrikerConstructor();
    private EventManager eventManager;
    private RenderCore renderCore;
    private Scissor scissor;
    private ModuleProvider moduleProvider;
    private ModuleRepository moduleRepository;
    private ModuleSwitcher moduleSwitcher;
    private ClickGui clickgui;
    private ConfigSystem configSystem;
    private CommandManager commandManager;
    private TPSCalculate tpsCalculate;
    private HudManager hudManager = new HudManager();

    public void init() {
        MacroRepository.getInstance().init();
        WayRepository.getInstance().init();
        BlockESPConfig.getInstance().load();
        FriendConfig.getInstance().load();
        PrefixConfig.getInstance().load();
        StaffConfig.getInstance().load();
        ProxyConfig.getInstance().load();
        DragConfig.getInstance().load();
        BindConfig.getInstance();

        FontInitializer.register();

        tpsCalculate = new TPSCalculate();

        clickgui = new ClickGui();
        eventManager = new EventManager();
        renderCore = new RenderCore();
        scissor = new Scissor();
        hudManager = new HudManager();
        hudManager.initElements();
        moduleRepository = new ModuleRepository();
        moduleRepository.setup();
        moduleProvider = new ModuleProvider(moduleRepository.modules());
        moduleSwitcher = new ModuleSwitcher(moduleRepository.modules(), eventManager);
        configSystem = new ConfigSystem();
        configSystem.init();
        commandManager = new CommandManager();
        commandManager.init();
    }
}