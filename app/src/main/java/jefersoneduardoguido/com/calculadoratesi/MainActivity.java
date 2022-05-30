package jefersoneduardoguido.com.calculadoratesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText texto;
    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_igual, btn_ans, btn_ac, btn_x, btn_div, btn_ponto, btn_mais, btn_menos;
    private String visor = "", ans = "0", operando = "";
    private Double resultado = 0.0, num1 = 0.0, num2 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zeraNum();
        iniciaObjetos();

    }

    @Override
    public void onClick(View view) {

        //captura o id do botão clicado
        switch (view.getId()){
            case R.id.bt_0:
                visor += "0";
                recebeNum("0");
                texto.setText(visor);
                break;
            case R.id.bt_1:
                visor += "1";
                recebeNum("1");
                texto.setText(visor);
                break;
            case R.id.bt_2:
                visor += "2";
                recebeNum("2");
                texto.setText(visor);
                break;
            case R.id.bt_3:
                visor += "3";
                recebeNum("3");
                texto.setText(visor);
                break;
            case R.id.bt_4:
                visor += "4";
                recebeNum("4");
                texto.setText(visor);
                break;
            case R.id.bt_5:
                visor += "5";
                recebeNum("5");
                texto.setText(visor);
                break;
            case R.id.bt_6:
                visor += "6";
                recebeNum("6");
                texto.setText(visor);
                break;
            case R.id.bt_7:
                visor += "7";
                recebeNum("7");
                texto.setText(visor);
                break;
            case R.id.bt_8:
                visor += "8";
                recebeNum("8");
                texto.setText(visor);
                break;
            case R.id.bt_9:
                visor += "9";
                recebeNum("9");
                texto.setText(visor);
                break;

            case R.id.bt_ans:
                visor += "ans";
                texto.setText(visor);
                break;

            case R.id.bt_ac:
                visor = "";
                texto.setText("");
                break;

            case R.id.bt_igual:
                fazCalc(operando);
                ans = ""+resultado;
                visor = "";
                visor = ans;
                texto.setText(visor);
                break;

            case R.id.bt_ponto:
                recebeNum(".");
                visor += ".";
                texto.setText(visor);
                break;

            case R.id.bt_menos:
                visor += "-";
                operando = "-";
                texto.setText(visor);
                break;

            case R.id.bt_mais:
                visor += "+";
                operando = "+";
                texto.setText(visor);
                break;

            case R.id.bt_div:
                visor += "/";
                operando = "/";
                texto.setText(visor);
                break;

            case R.id.bt_x:
                visor += "X";
                operando = "*";
                texto.setText(visor);
                break;
        }
    }
    
    public void zeraNum(){
        visor = "";
        ans = "0";
        operando = "";
        resultado = 0.0;
        num1 = 0.0;
        num2 = 0.0;
    }

    public void recebeNum(String num){
        String aux = "";

        if (operando.isEmpty() && aux.isEmpty()){
            aux += num;
            num1 = Double.parseDouble(aux);
        }
        else {
            aux = "";
            aux += num;
            num2 = Double.parseDouble(aux);
        }
    }

    // %, raiz, dobro, !
    public void fazCalc(String aux){
        switch (aux){
            case "/":
                resultado = (num1 / num2);
                break;
            case "+":
                resultado = (num1 + num2);
                break;
            case "-":
                resultado = (num1 - num2);
                break;
            case "*":
                resultado = (num1 * num2);
                break;
        }
    }

    private void iniciaObjetos() {
        // Método para iniciar todos os objetos utilizados pelo aplicativo

        btn_0 = (Button) findViewById(R.id.bt_0);
        btn_0.setOnClickListener(this);
        btn_1 = (Button) findViewById(R.id.bt_1);
        btn_1.setOnClickListener(this);
        btn_2 = (Button) findViewById(R.id.bt_2);
        btn_2.setOnClickListener(this);
        btn_3 = (Button) findViewById(R.id.bt_3);
        btn_3.setOnClickListener(this);
        btn_4 = (Button) findViewById(R.id.bt_4);
        btn_4.setOnClickListener(this);
        btn_5 = (Button) findViewById(R.id.bt_5);
        btn_5.setOnClickListener(this);
        btn_6 = (Button) findViewById(R.id.bt_6);
        btn_6.setOnClickListener(this);
        btn_7 = (Button) findViewById(R.id.bt_7);
        btn_7.setOnClickListener(this);
        btn_8 = (Button) findViewById(R.id.bt_8);
        btn_8.setOnClickListener(this);
        btn_9 = (Button) findViewById(R.id.bt_9);
        btn_9.setOnClickListener(this);

        btn_ans = (Button) findViewById(R.id.bt_ans);
        btn_ans.setOnClickListener(this);
        btn_igual = (Button) findViewById(R.id.bt_igual);
        btn_igual.setOnClickListener(this);
        btn_ac = (Button) findViewById(R.id.bt_ac);
        btn_ac.setOnClickListener(this);
        btn_ponto = (Button) findViewById(R.id.bt_ponto);
        btn_ponto.setOnClickListener(this);

        btn_menos = (Button) findViewById(R.id.bt_menos);
        btn_menos.setOnClickListener(this);
        btn_mais = (Button) findViewById(R.id.bt_mais);
        btn_mais.setOnClickListener(this);
        btn_x = (Button) findViewById(R.id.bt_x);
        btn_x.setOnClickListener(this);
        btn_div = (Button) findViewById(R.id.bt_div);
        btn_div.setOnClickListener(this);

        texto = (EditText) findViewById(R.id.visor);
    }

}
