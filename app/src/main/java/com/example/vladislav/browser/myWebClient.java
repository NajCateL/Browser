package com.example.vladislav.browser;

import android.webkit.WebViewClient;
import android.webkit.WebView;

/**
 * Created by Vladislav on 04.06.2018.
 */

public class myWebClient extends WebViewClient {
    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
