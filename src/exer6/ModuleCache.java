package exer6;

import java.util.ArrayList;

public class ModuleCache {
	private volatile static ModuleCache uniqueInstance;
		
	protected ArrayList<String> userInfos = new ArrayList<>();
	private ModuleCache() {}
	
	public static ModuleCache getInstance() {
		if (uniqueInstance == null) {
			synchronized (ModuleCache.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new ModuleCache();
				}
			}
		}
		return uniqueInstance;
	}
	
	public void storeInfo(RuntimeEnv re) {
		userInfos.add(re.getUsername() + ',' + re.getPassword());
	}
	
	
	
}
