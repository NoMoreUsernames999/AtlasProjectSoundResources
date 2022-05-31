package expansesoundresource.mod.util.handlers;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

//Will look for all event bus subscribers when loading. Does not need to be referenced in main 
@EventBusSubscriber 
public class RegistryHandler {

	

	public static void InitRegistries() {
		
		SoundsHandler.registerSounds();
		System.out.println("Expanse sounds registered"); 
	}
}
