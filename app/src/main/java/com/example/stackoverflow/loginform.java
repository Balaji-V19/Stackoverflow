package com.example.stackoverflow;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import dmax.dialog.SpotsDialog;

public class loginform extends AppCompatActivity {
    private EditText name,email,paswd;
    private Button buttonlog;
    private FirebaseAuth mauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginform);
        name=findViewById(R.id.name);
        email=findViewById(R.id.Email);
        paswd=findViewById(R.id.Password);
        buttonlog=findViewById(R.id.button);
        mauth=FirebaseAuth.getInstance();

        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final SpotsDialog dialog=new SpotsDialog(loginform.this);
                dialog.show();
                mauth.createUserWithEmailAndPassword(email.getText().toString(),paswd.getText().toString())
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                dialog.dismiss();
                                Intent i=new Intent(loginform.this,selecttag.class);
                                startActivity(i);
                                Toast.makeText(loginform.this, "Login successfully", Toast.LENGTH_SHORT).show();

                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        dialog.dismiss();
                        Toast.makeText(loginform.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }

}
