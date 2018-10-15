package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * It is used for tutorials
 */
public class BeginnerTutorialActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    LinkedHashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> chap1 = new ArrayList<String>();
        chap1.add("1.1 What is Autosar?");
        chap1.add("1.2 Basic AUTOSAR Approach");
        chap1.add("1.3 Autosar Architecture");
        chap1.add("1.4 Microcontroller Abstraction Layer");
        chap1.add("1.5 ECU Abstraction Layer");
        chap1.add("1.6 Complex Driver");
        chap1.add("1.7 Services Layer");
        chap1.add("1.8 Run Time Environment (RTE)");
        chap1.add("1.9 Autosar Methodology");
        chap1.add("1.10 System and ECU");

        List<String> chap2 = new ArrayList<String>();
        chap2.add("2.1 Why is the focus on Automotives?");

        List<String> chap3 = new ArrayList<String>();
        chap3.add("3.1 Standards before Autosar");

        List<String> chap4 = new ArrayList<String>();
        chap4.add("4.1 Layered Architecture");

        List<String> chap5 = new ArrayList<String>();
        chap5.add("5.1 AUTOSAR Application Layer");

        List<String> chap6 = new ArrayList<String>();
        chap6.add("6.1 AUTOSAR application software components");
        chap6.add("6.1 Types of Software Components");

        List<String> chap7 = new ArrayList<String>();
        chap7.add("7.1 The AUTOSAR Ports");

        List<String> chap8 = new ArrayList<String>();
        chap8.add("8.1 The AUTOSAR Port Interfaces");
        chap8.add("8.2 Client-Server interface");
        chap8.add("8.3 Sender-Receiver interface");

        List<String> chap9 = new ArrayList<String>();
        chap9.add("9.1 AUTOSAR Runtime Environment (RTE)");

        List<String> chap10 = new ArrayList<String>();
        chap10.add("10.1 Interfaces");

        List<String> chap11 = new ArrayList<String>();
        chap11.add("11.1 RTE Generation Process");
        chap11.add("11.2 RTE Contract phase");
        chap11.add("11.3 RTE Generation phase ");

        List<String> chap12 = new ArrayList<String>();
        chap12.add("12.1 RTE Mapping");
        chap12.add("12.2 Access to ports from a software component implementation");
        chap12.add("12.3 Access to Basic Software");


        List<String> chap13 = new ArrayList<String>();
        chap13.add("13.1 AUTOSAR Base Software (BSW)");

        List<String> chap14 = new ArrayList<String>();
        chap14.add("14.1 Memory Stack (MemStack)");
        chap14.add("14.2 Non-Volatile Memory Manager (NvM)");
        chap14.add("14.3 Memory Interface (MemIf) Module");
        chap14.add("14.4 EEPROM Abstraction(Ea.)");
        chap14.add("14.5 EEPROM Drivers");
        chap14.add("14.6 Flash EEPROM Emulation (FEE) Module");
        chap14.add("14.7 Flash Driver");
        chap14.add("14.8 Complex Drivers");

        List<String> chap15 = new ArrayList<String>();
        chap15.add("15.1 Communication Stack (ComStack)");
        chap15.add("15.2 Communication stack in AUTOSAR layered architecture is a set of following software modules");
        chap15.add("15.3 Modules of COM Stack");

        List<String> chap16 = new ArrayList<String>();
        chap16.add("16.1 Diagnostic Stack (DiagStack)");
        chap16.add("16.2 Definition");

        List<String> chap17 = new ArrayList<String>();
        chap17.add("17.1 Modules of Diagnostic Communication Manager (DCM)");

        List<String> chap18 = new ArrayList<String>();
        chap18.add("18.1 Autosar OS");

        List<String> chap19 = new ArrayList<String>();
        chap19.add("19.1 Scalability Class");

        List<String> chap20 = new ArrayList<String>();
        chap20.add("20.1 Task");
        chap20.add("20.2 Stages of Task:");
        chap20.add("20.3 Task Activation");
        chap20.add("20.4 Task Configuration Parameters:");

        List<String> chap21 = new ArrayList<String>();
        chap21.add("21.1 Scheduling");
        chap21.add("21.2 Fully-Preemptive Scheduling");
        chap21.add("21.3 Non-Preemptive Scheduling");

        List<String> chap22 = new ArrayList<String>();
        chap22.add("22.1 Interrupts");

        List<String> chap23 = new ArrayList<String>();
        chap23.add("23.1 Resources");

        List<String> chap24 = new ArrayList<String>();
        chap24.add("24.1 Events");

        List<String> chap25 = new ArrayList<String>();
        chap25.add("25.1 Counters");

        List<String> chap26 = new ArrayList<String>();
        chap26.add("26.1 Alarms");

        List<String> chap27 = new ArrayList<String>();
        chap27.add("27.1 Schedule Table");

        List<String> chap28 = new ArrayList<String>();
        chap28.add("28.1 Hooks");

        expandableListDetail.put("1. What is Autosar?", chap1);
        expandableListDetail.put("2. Why is the focus on Automotives?", chap2);
        expandableListDetail.put("3. Standards before Autosar", chap3);
        expandableListDetail.put("4. Layered Architecture", chap4);
        expandableListDetail.put("5. AUTOSAR Application Layer", chap5);
        expandableListDetail.put("6. AUTOSAR application software components", chap6);
        expandableListDetail.put("7. The AUTOSAR Ports", chap7);
        expandableListDetail.put("8. The AUTOSAR Port Interfaces", chap8);
        expandableListDetail.put("9. AUTOSAR Runtime Environment (RTE)", chap9);
        expandableListDetail.put("10. Interfaces", chap10);
        expandableListDetail.put("11. RTE Generation Process", chap11);
        expandableListDetail.put("12. RTE Mapping", chap12);
        expandableListDetail.put("13. AUTOSAR Base Software (BSW)", chap13);
        expandableListDetail.put("14. Memory Stack (MemStack)", chap14);
        expandableListDetail.put("15. Communication Stack (ComStack)", chap15);
        expandableListDetail.put("16. Diagnostic Stack (DiagStack)", chap16);
        expandableListDetail.put("17. Modules of Diagnostic Communication Manager (DCM)", chap17);
        expandableListDetail.put("18. Autosar OS", chap18);
        expandableListDetail.put("19. Scalability Class ", chap19);
        expandableListDetail.put("20. Task", chap20);
        expandableListDetail.put("21. Scheduling", chap21);
        expandableListDetail.put("22. Interrupts", chap22);
        expandableListDetail.put("23. Resources", chap23);
        expandableListDetail.put("24. Events", chap24);
        expandableListDetail.put("25. Counters", chap25);
        expandableListDetail.put("26. Alarms", chap26);
        expandableListDetail.put("27. Schedule Table", chap27);
        expandableListDetail.put("28. Hooks", chap28);

        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                final Intent disp_content = new Intent(BeginnerTutorialActivity.this, displayContent.class);
                disp_content.putExtra("chapter",groupPosition);
                disp_content.putExtra("topic",childPosition);
                startActivity(disp_content);
                return true;
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
}