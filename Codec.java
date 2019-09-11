import java.util.HashMap;
import java.util.Map;

/**
 * Encode and Decode Tiny Url
 * @author asharda
 *
 */
public class Codec {
private Map<String, String> m = new HashMap<>();
	
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String code = Integer.toHexString(hashCode(longUrl));
    	m.put(code, longUrl);
        return code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return m.get(shortUrl);
    }

    private int hashCode(String url) {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
    }
    
	public static void main(String[] args) {
		
		Codec c=new Codec();
		System.out.println(c.decode(c.encode("https://leetcode.com/problems/design-tinyurl")));
	}

}


