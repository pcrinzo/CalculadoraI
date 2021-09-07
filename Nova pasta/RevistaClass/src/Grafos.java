import java.util.ArrayList;
import java.util.List;

public class Grafos{
public class Vertice{
    String nome;
            List<Aresta> adj;

    Vertice (String nome){
        this.nome=nome;
        this.adj=new ArrayList<Aresta>();}

        void addAdj (Aresta e){
            adj.add(e);}}

            public class Aresta{
                Vertice origem;
                Vertice destino;
                Aresta(Vertice origem, Vertice destino){
                    this.origem=origem;
                    this.destino=destino;
                }
            }

            List<Vertice>vertices;
            List<Aresta> arestas;

             public Grafos(){
                vertices = new ArrayList<Vertice>();
                arestas = new ArrayList<Aresta>();
            }

         public static void main(String[]args){
            Grafos g =new Grafos();
            Vertice s= g.addVertice("s");
            Vertice t= g.addVertice("t");

             System.out.println(g);


    }
}
