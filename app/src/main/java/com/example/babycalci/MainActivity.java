package com.example.babycalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpl,bmi,bml,bdiv,bclr,bdot,beq;
    TextView t1,t2;
    int check,r1,r2, len, res;
    double resd;
    char sy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.result);
        t2=(TextView)findViewById(R.id.upres);

        b1 =(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button)findViewById(R.id.b0);
        bpl=(Button)findViewById(R.id.bpl);
        bmi=(Button)findViewById(R.id.bmi);
        bml=(Button)findViewById(R.id.bml);
        bdiv=(Button)findViewById(R.id.bdiv);
        bclr=(Button)findViewById(R.id.bc);
        bdot=(Button)findViewById(R.id.bdot);
        beq=(Button)findViewById(R.id.beq);



        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0)
                                      t1.setText("1");
                                      else{
                                          t1.setText(t1.getText()+"1");
                                      }
                                  }
                              }
        );
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0) t1.setText("2");
                                      else{
                                          t1.setText(t1.getText()+"2");
                                      }
                                  }
                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {

                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0)if(check==0) t1.setText("3");
                                      else{
                                          t1.setText(t1.getText()+"3");
                                      }
                                  }
                              }
        );
        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0)t1.setText("4");
                                      else{
                                          t1.setText(t1.getText()+"4");
                                      }
                                  }
                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0)t1.setText("5");
                                      else{
                                          t1.setText(t1.getText()+"5");
                                      }
                                  }
                              }
        );
        b6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0) t1.setText("6");
                                      else{
                                          t1.setText(t1.getText()+"6");
                                      }
                                  }
                              }
        );
        b7.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0)t1.setText("7");
                                      else{
                                          t1.setText(t1.getText()+"7");
                                      }
                                  }
                              }
        );
        b8.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0)t1.setText("8");
                                      else{
                                          t1.setText(t1.getText()+"8");
                                      }
                                  }
                              }
        );
        b9.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0)t1.setText("9");
                                      else{
                                          t1.setText(t1.getText()+"9");
                                      }
                                  }
                              }
        );
        b0.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      check= Integer.parseInt((String)t1.getText());
                                      if(check==0)t1.setText("0");
                                      else{
                                          t1.setText(t1.getText()+"0");
                                      }

                                  }
                              }
        );

        bpl.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      r1=Integer.parseInt((String)t1.getText());
                                      t2.setText(t1.getText()+"+");
                                      t1.setText("0");
                                  }
                              }
        );
        bmi.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      r1=Integer.parseInt((String)t1.getText());
                                      t2.setText(t1.getText()+"-");
                                      t1.setText("0");
                                  }
                              }
        );
        bml.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      r1=Integer.parseInt((String)t1.getText());
                                      t2.setText(t1.getText()+"×");
                                      t1.setText("0");
                                  }
                              }
        );
        bdiv.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      r1=Integer.parseInt((String)t1.getText());
                                      t2.setText(t1.getText()+"÷");
                                      t1.setText("0");
                                  }
                              }
        );
        bclr.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      t1.setText("0");
                                      t2.setText("0");
                                  }
                              }
        );

        beq.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       r2=Integer.parseInt((String)t1.getText());
                                       String S= (String)t2.getText();
                                       len=S.length();
                                       sy=S.charAt(len-1);
                                       switch(sy){
                                           case '+': {      res=r1+r2;
                                                            t1.setText(res+"");
                                                            break;
                                                        }
                                           case '-': {      res=r1-r2;
                                                            t1.setText(res+"");
                                                            break;
                                           }
                                           case '×': {      res=r1*r2;
                                                            t1.setText(res+"");
                                                            break;
                                           }
                                           case '÷': {      resd=(r1+0.0)/r2;
                                                            t1.setText(resd+"");
                                                            break;
                                           }
                                       }

                                       t2.setText("0");
                                   }
                               }
        );
    }

}
