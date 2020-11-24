package com.hellobike.base.tunnel.publisher.es;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

/**
 * @author yang.song
 */
public class EsPublisherTest {

    @Test
    public void insert() {
        Map<String, Object> map = new HashMap<>();
        map.put("meta.ImageInfo.corners", 1);
        map.put("meta.ImageInfo.centreLocation", 2);
        map.put("meta.test", 3);
        Map<String, Object> result = EsPublisher.toStructDoc(map);
        System.out.println(result.size());
    }
}