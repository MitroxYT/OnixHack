package onix.util.mods.config.wave;

/*
public class WaveCapesConfigOverride implements PreLaunchEntrypoint {

    private static final String CONFIG_CONTENT = """
            {
              "configVersion": 2,
              "windMode": "WAVES",
              "capeStyle": "SMOOTH",
              "capeMovement": "BASIC_SIMULATION_3D",
              "gravity": 15,
              "heightMultiplier": 5,
              "straveMultiplier": 5
            }
            """;

    @Override
    public void onPreLaunch() {
        Path configDir = FabricLoader.getInstance().getConfigDir();
        Path waveCapesConfig = configDir.resolve("waveycapes.json");
        
        try {
            Files.writeString(waveCapesConfig, CONFIG_CONTENT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}*/