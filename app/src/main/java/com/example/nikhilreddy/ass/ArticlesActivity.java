package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * it is used for arcticles
 */
public class ArticlesActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        final ArrayList<Link> generalList = new ArrayList<>();

        generalList.add(new Link(1,"Article   1","https://www.autosar.org/"));
        generalList.add(new Link(2,"Article   2","https://www.autosar.org/"));
        generalList.add(new Link(3,"Article   3","https://www.autosar.org/"));
        generalList.add(new Link(4,"Article   4","https://www.autosar.org/"));
        generalList.add(new Link(5,"Article   5","https://www.autosar.org/"));
        generalList.add(new Link(6,"Article   6","https://www.autosar.org/"));
        generalList.add(new Link(7,"Article   7","https://www.autosar.org/"));
        generalList.add(new Link(8,"Article   8","https://www.autosar.org/"));
        generalList.add(new Link(9,"Article   9","https://www.autosar.org/"));
        generalList.add(new Link(10,"Article   10","https://www.autosar.org/"));

        ListView listView = (ListView) findViewById(R.id.articles_list_view);
        ArticleAdapter articleAdapter = new ArticleAdapter(ArticlesActivity.this,generalList,R.color.white);
        listView.setAdapter(articleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Link currentLink = generalList.get(i);
                String pressedUrl = currentLink.getLink();
                openWebPage(pressedUrl);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        // User pressed the search button
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        // User changed the text
        return false;
    }

    /**
     * it is used for opening the web page in the articles
     * @param url
     */
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
