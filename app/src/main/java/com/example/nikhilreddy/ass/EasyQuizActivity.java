package com.example.nikhilreddy.ass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * It is used for Easy Quiz
 */
public class EasyQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ArrayList<Item> quizlist = new ArrayList<>();

        quizlist.add(new Item(1,"chap   1"));
        quizlist.add(new Item(2,"chap   2"));
        quizlist.add(new Item(3,"chap   3"));
        quizlist.add(new Item(4,"chap   4"));
        quizlist.add(new Item(5,"chap   5"));
        quizlist.add(new Item(6,"chap   6"));
        quizlist.add(new Item(7,"chap   7"));
        quizlist.add(new Item(8,"chap   8"));
        quizlist.add(new Item(9,"chap   9"));
        quizlist.add(new Item(10,"chap   10"));

        ListView listView = (ListView) findViewById(R.id.quizList);
        ChapterAdapter chapterAdapter = new ChapterAdapter(EasyQuizActivity.this,quizlist,R.color.white);
        listView.setAdapter(chapterAdapter);
    }
}
