package intern.zappos.amko0l.ilovezappos.view;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.List;

import intern.zappos.amko0l.ilovezappos.R;
import intern.zappos.amko0l.ilovezappos.domain.ApiInterface;
import intern.zappos.amko0l.ilovezappos.domain.RetroClient;
import intern.zappos.amko0l.ilovezappos.model.Items;
import intern.zappos.amko0l.ilovezappos.model.ItemsResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by amitn on 08-02-2017.
 */

public class SearchResultsActivity extends AppCompatActivity {
    private static final String TAG = SearchResultsActivity.class.getSimpleName();

    private final static String API_KEY = "b743e26728e16b81da139182bb2094357c31d331";
    List<Items> items;

    private String postUrl = "";
    private WebView webView;
    private ProgressBar progressBar;
    private float m_downX;
    private ImageView imgHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    }
}
