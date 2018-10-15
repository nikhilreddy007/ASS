package com.example.nikhilreddy.ass;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;
    private int currentPage = 0;
    private final Integer[] XMEN= {R.drawable.autosar,R.drawable.programmers_fact,R.drawable.formats,R.drawable.zf};
    private ArrayList<Integer> XMENArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CardView tutorialcard = (CardView) findViewById(R.id.tutorialcard);
        final LinearLayout tutoriallayout = (LinearLayout) findViewById(R.id.tutoriallayout);
//        final LinearLayout tutorialoptionslayout = (LinearLayout) findViewById(R.id.tutorialoptionslayout);
//        final LinearLayout beginnertutoriallayout = (LinearLayout) findViewById(R.id.beginnertutoriallayout);
//        final LinearLayout intermediatetutoriallayout = (LinearLayout) findViewById(R.id.intermediatetutoriallayout);
//        final LinearLayout advancedtutoriallayout = (LinearLayout) findViewById(R.id.advancedtutoriallayout);
        final CardView articlescard = (CardView) findViewById(R.id.articlescard);
        final LinearLayout articleslayout = (LinearLayout) findViewById(R.id.articleslayout);
        final CardView faqcard = (CardView) findViewById(R.id.faqcard);
        final LinearLayout faqlayout = (LinearLayout) findViewById(R.id.faqlayout);
        final CardView quizcard = (CardView) findViewById(R.id.quizcard);
        final LinearLayout quizlayout = (LinearLayout) findViewById(R.id.quizlayout);
        final LinearLayout quizoptionslayout = (LinearLayout) findViewById(R.id.quizoptionslayout);
        final LinearLayout easyquizlayout = (LinearLayout) findViewById(R.id.easyquizlayout);
        final LinearLayout mediumquizlayout = (LinearLayout) findViewById(R.id.mediumquizlayout);
        final LinearLayout hardquizlayout = (LinearLayout) findViewById(R.id.hardquizlayout);

        final Intent beginnertut_intent = new Intent(this, BeginnerTutorialActivity.class);
        final Intent easyquiz_intent = new Intent(this, EasyQuizActivity.class);
        final Intent mediumquiz_intent = new Intent(this, MediumQuizActivity.class);
        final Intent hardquiz_intent = new Intent(this, HardQuizActivity.class);
        final Intent articles_intent = new Intent(this, ArticlesActivity.class);
        final Intent faq_intent = new Intent(this, FaqActivity.class);

        init();

        tutorialcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(tutoriallayout.getVisibility() == View.VISIBLE) {
                    tutoriallayout.setVisibility(View.GONE);
                    //tutorialoptionslayout.setVisibility(View.VISIBLE);
                    quizlayout.setVisibility(View.VISIBLE);
                    quizoptionslayout.setVisibility(View.GONE);
                } else {
                    tutoriallayout.setVisibility(View.VISIBLE);
                    //tutorialoptionslayout.setVisibility(View.GONE);
                }
            }
        });
        faqcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tutoriallayout.setVisibility(View.VISIBLE);
                //tutorialoptionslayout.setVisibility(View.GONE);
                quizlayout.setVisibility(View.VISIBLE);
                quizoptionslayout.setVisibility(View.GONE);

            }
        });

        quizcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(quizlayout.getVisibility() == View.VISIBLE) {
                    tutoriallayout.setVisibility(View.VISIBLE);
                 //   tutorialoptionslayout.setVisibility(View.GONE);
                    quizlayout.setVisibility(View.GONE);
                    quizoptionslayout.setVisibility(View.VISIBLE);
                } else {
                    quizlayout.setVisibility(View.VISIBLE);
                    quizoptionslayout.setVisibility(View.GONE);
                }
            }
        });

        tutoriallayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(beginnertut_intent);
            }
        });
        /*
        intermediatetutoriallayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intermediatetut_intent);
            }
        });
        advancedtutoriallayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(advancedtut_intent);
            }
        });
        */
        easyquizlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(easyquiz_intent);
            }
        });
        mediumquizlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(mediumquiz_intent);
            }
        });
        hardquizlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(hardquiz_intent);
            }
        });
        articleslayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(articles_intent);
            }
        });
        faqlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(faq_intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the main_menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {
            case R.id.contact_us:
                //your action
                Intent contactIntent = new Intent(MainActivity.this,ContactActivity.class);
                startActivity(contactIntent);
                break;
            case R.id.why_zf:
                //your action
                Intent zfIntent = new Intent(MainActivity.this,ZFActivity.class);
                startActivity(zfIntent);
                break;
            case R.id.why_autosar:
                //your action
                Intent autosarIntent = new Intent(MainActivity.this,AutosarActivity.class);
                startActivity(autosarIntent);
                break;
            /*
            case R.id.help:
                //your action
                Globals.saveFirstTimeLaunch(true);
                Intent whyAutosarIntent = new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity(whyAutosarIntent);
                break;
            */
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter(MainActivity.this,XMENArray));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);
    }
}
