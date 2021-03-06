package com.github.florent37.testsample;

import android.content.Context;

import com.github.florent37.androidunittest.AndroidUnitTest;
import com.github.florent37.androidunittest.annotations.RContext;
import com.github.florent37.androidunittest.annotations.RFragment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.google.common.truth.Truth.assertThat;

@RunWith(CustomTestRunner.class)
public class MainFragmentTest {
    @Rule public AndroidUnitTest androidUnitTest = AndroidUnitTest.rule();

    @RContext Context context;
    @RFragment MainFragment fragment;

    @Test
    public void testAnnotations() throws Exception {
        assertThat(context).isNotNull();
        assertThat(fragment).isNotNull();
    }

}
