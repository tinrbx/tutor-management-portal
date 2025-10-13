package com.example.otams;

import android.app.Activity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Map;

public class DataManager {
    // Default Vars
    private static FirebaseFirestore getDb() {
        return FirebaseFirestore.getInstance();
    }

    public interface DataCallback {
        void onSuccess(Map<String, Object> user);
        void onFailure(String errorMessage);
    }

    // Main Methods
    public static void getData(Activity activity, DataCallback callback) {
        // Retrieve the current user
        FirebaseUser currentUser = AuthManager.getCurrentUser();

        if (currentUser == null) {
            callback.onFailure("No user is logged in");

            return;
        }

        // Now send their data
        String uid = currentUser.getUid();

        getDb().collection("users").document(uid).get()
                .addOnSuccessListener(activity, doc -> {
                    callback.onSuccess(doc.getData());
                })
                .addOnFailureListener(activity, doc -> {
                    callback.onFailure(null);
                });
    }
}