package ru.ra;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.junit.Test;

import java.util.Arrays;

public class DozerTest {
    @Test
    public void testApp() {
        Mapper mapper = new DozerBeanMapper();

        Src src = new Src();
        src.setColumns(new byte[][]{new byte[]{1, 2, 3}});

        System.out.println(Arrays.deepToString(src.getColumns()));

        Dst dst = mapper.map(src, Dst.class);
        System.out.println(Arrays.deepToString(dst.getColumns()));
    }
}
