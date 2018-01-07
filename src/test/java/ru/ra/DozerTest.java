package ru.ra;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.junit.Assert;
import org.junit.Test;

public class DozerTest {
    @Test
    public void testApp() {
        Mapper mapper = new DozerBeanMapper();

        Src src = new Src();
        src.setColumns(new byte[][]{new byte[]{1, 2, 3}});

        Dst dst = mapper.map(src, Dst.class);

        Assert.assertArrayEquals(src.getColumns(), dst.getColumns());
    }
}
