package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;

    //Criar a base de dados para os filmes

    String titulo[] = {"Star Wars" , "Cop Land", "Aquaman", "A Última Ceia", "Namoro Ou Liberdade" , "Jogos Famintos"};
    String descricao[] = {"Star Wars é uma franquia do tipo space opera estadunidense criada pelo cineasta George Lucas, que conta com uma série de nove filmes de fantasia científica e dois spin-offs.",
            "Um jovem policial de Nova Jersey, em uma atitude impensada, mata dois inocentes. Para protegê-lo, seus colegas forjam seu suicídio, mas o corregedor da polícia não acredita na história.",
            "Aquaman, meio-humano e meio-atlante, e verdadeiro herdeiro do trono. Com a ajuda da princesa Mera, Aquaman precisa recuperar o lendário Tridente de Atlan e aceitar seu destino como protetor das profundezas.",
            "Letícia é uma mulher negra que perde o marido, um assassino condenado à morte. Hank é um policial racista que perde o filho por suicídio. Um trágico acidente une essas almas sofridas em um improvável relacionamento, mas um segredo pode destruir tudo." ,
            "Após descobrir a traição de sua esposa, Mikey vai receber a ajuda dos amigos. Eles fazem um pacto em que os três devem ficar solteiros, mas Mikey está disposto a reconquistar a ex.",
            "A corajosa e habilidosa Kantmiss Evershot se oferece para participar dos Jogos Famintos, em que ela e o filho do padeiro Peter Malarkey lutam pelas suas vidas e ainda podem ganhar alguns presentes inesperados."
    };
    String acesso[] = {"4.5" , "3.0", "5.0", "3.5", "4.0" , "2.5"};
    int filmes[] = {R.drawable.star, R.drawable.cop, R.drawable.aquaman, R.drawable.ceia, R.drawable.namoro, R.drawable.jogos };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = findViewById(R.id.idlistafilmes);

        MyAdapter adapter = new MyAdapter();

        //preparar para instanciar o adaptador
        listaFilmes.setAdapter(adapter);

    }

    //criando uma inner class MyAdapter

    public class MyAdapter extends BaseAdapter {


        //getcount conta quantos objetos tem na lista
        @Override
        public int getCount() {
            return filmes.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Variaveis do modelo
            ImageView imagemFilme;
            TextView tituloFilme, descricaoFilme, acessoFilme;

            //Adaptador ligando ao modelo

            View v = getLayoutInflater().inflate(R.layout.modelo_filmes, null);

            //Apresentar as variaveis do java para o modelo xml

            imagemFilme = v.findViewById(R.id.imgFilmes);
            tituloFilme = v.findViewById(R.id.idTituloFilmes);
            descricaoFilme = v.findViewById(R.id.idDescricaoFilmes);
            acessoFilme = v.findViewById(R.id.idAcessoFilmes);


            //Inserindo os valores nas variaveis do java
            tituloFilme.setText(titulo[i]);
            descricaoFilme.setText(descricao[i]);
            acessoFilme.setText(acesso[i]);
            imagemFilme.setImageResource(filmes[i]);

            return v;
        }
    }
}