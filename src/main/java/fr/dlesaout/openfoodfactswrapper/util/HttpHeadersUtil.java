package fr.dlesaout.openfoodfactswrapper.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;


public class HttpHeadersUtil {

    private HttpHeadersUtil() {
    }

    public static HttpHeaders createHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
