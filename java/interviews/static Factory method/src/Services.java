import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services implements iService{
	private Services() { }

	private static final Map<String, iProvider> providers =
		new ConcurrentHashMap<String, iProvider>() ;
	public static final String DEFAULT_PROVIDER_NAME = "<def>";

	// Provider registrati on API
	public static void registerDefaultProvider(iProvider p) {
		registerProvider(DEFAULT_PROVIDER_NAME, p) ;
	}
	public static void registerProvider(String name, iProvider p) {
		providers.put(name, p);
	}
	// Service access API
	public static iService newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}
	public static iService newInstance(String name) {
		iProvider p = providers.get(name) ;
		if (p == null )
			throw new IllegalArgumentException(
					"No provider registered with name: " + name);
		return p.newService();
	}
}
