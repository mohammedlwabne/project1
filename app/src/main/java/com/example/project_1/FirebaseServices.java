package com.example.project_1;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Calendar;

public class FirebaseServices {
    private static FirebaseServices instance;
    private FirebaseAuth auth;
    private Calendar fire;
    private FirebaseStorage storage;

    public FirebaseAuth getAuth() {
        return auth;
    }

    public Calendar getFire() {
        return fire;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }

    public void getProjectSet()
    {

    }

    public FirebaseServices() {
        auth = FirebaseAuth.getInstance();
        Calendar FirebaseFirestore = null;
        fire = FirebaseFirestore.getInstance();
        storage = FirebaseStorage.getInstance();
    }

    public static FirebaseServices getInstance() {
        if (instance == null)
            instance = new FirebaseServices();
        return instance;
    }
}

