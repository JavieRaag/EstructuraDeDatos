#include <iostream>
#include <fstream>
#include <sstream>
#include <iomanip>
#include <vector>

#define Nombre_Archivo "D:/Proyectos ingeneria en computacion/PresenciaRedesSociales.csv"

using namespace std;

int main()
{
    int followersEnero;
    int followersJunio;
    int crecimientoTwitter;
    int crecimientoFacebook;
    int meses = 6;
    int mpf = 0;
    int dvy = 0, dvy2 = 0;
    int mesInicio = 0, mesFinal = 0;
    int megustaFacebook, megustaTwitter, megustaYoutube;
    vector<int> visualizaciones(12);

    ifstream archivo(Nombre_Archivo);

    string linea;
    char delimitador = ',';

    getline(archivo, linea);

    cout << left << setw(20) << "Red Social"
         << setw(30) << "Concepto"
         << setw(10) << "anio"
         << setw(8) << "Ene"
         << setw(8) << "Feb"
         << setw(8) << "Mar"
         << setw(8) << "Abr"
         << setw(8) << "May"
         << setw(8) << "Jun"
         << setw(8) << "Jul"
         << setw(8) << "Ago"
         << setw(8) << "Sep"
         << setw(8) << "Oct"
         << setw(8) << "Nov"
         << setw(8) << "Dic"
         << endl;

    while (getline(archivo, linea))
    {
        stringstream stream(linea);
        string redsocial, concepto, anio, enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;

        getline(stream, redsocial, delimitador);
        getline(stream, concepto, delimitador);
        getline(stream, anio, delimitador);
        getline(stream, enero, delimitador);
        getline(stream, febrero, delimitador);
        getline(stream, marzo, delimitador);
        getline(stream, abril, delimitador);
        getline(stream, mayo, delimitador);
        getline(stream, junio, delimitador);
        getline(stream, julio, delimitador);
        getline(stream, agosto, delimitador);
        getline(stream, septiembre, delimitador);
        getline(stream, octubre, delimitador);
        getline(stream, noviembre, delimitador);
        getline(stream, diciembre, delimitador);

        cout << left << setw(20) << redsocial
             << setw(30) << concepto
             << setw(10) << anio
             << setw(8) << enero
             << setw(8) << febrero
             << setw(8) << marzo
             << setw(8) << abril
             << setw(8) << mayo
             << setw(8) << junio
             << setw(8) << julio
             << setw(8) << agosto
             << setw(8) << septiembre
             << setw(8) << octubre
             << setw(8) << noviembre
             << setw(8) << diciembre
             << endl;

        int creceEnero = stoi(enero);
        int creceFebrero = stoi(febrero);
        int creceMarzo = stoi(marzo);
        int creceAbril = stoi(abril);
        int creceMayo = stoi(mayo);
        int creceJunio = stoi(junio);

        int promEnero = stoi(enero);
        int promFebrero = stoi(febrero);
        int promMarzo = stoi(marzo);
        int promAbril = stoi(abril);
        int promMayo = stoi(mayo);
        int promJunio = stoi(junio);
        int promJulio = stoi(julio);
        int promAgosto = stoi(septiembre);
        int promSeptiembre = stoi(agosto);
        int promOctubre = stoi(octubre);
        int promNoviembre = stoi(noviembre);
        int promDiciembre = stoi(diciembre);

        if (redsocial == "TWITTER" && concepto == "SEGUIDORES (FOLLOWERS)")
        {
            followersEnero = promEnero;
            followersJunio = promJunio;
        }

        if (redsocial == "TWITTER" && concepto == "CRECIMIENTO DE FOLLOWERS")
        {
            crecimientoTwitter = creceEnero + creceFebrero + creceMarzo + creceAbril + creceMayo + creceJunio;
        }

        if (redsocial == "FACEBOOK" && concepto == "CRECIMIENTO (seguidores)")
        {
            crecimientoFacebook = creceEnero + creceFebrero + creceMarzo + creceAbril + creceMayo + creceJunio;
        }

        if (redsocial == "FACEBOOK" && concepto == "ME GUSTA EN PUBLICACIONES")
        {
            megustaFacebook = promEnero + promFebrero + promMarzo + promAbril + promMayo + promJunio + promJulio + promAgosto + promSeptiembre + promOctubre + promNoviembre + promDiciembre;
        }

        if (redsocial == "TWITTER" && concepto == "ME GUSTA")
        {
            megustaTwitter = promEnero + promFebrero + promMarzo + promAbril + promMayo + promJunio + promJulio + promAgosto + promSeptiembre + promOctubre + promNoviembre + promDiciembre;
        }

        if (redsocial == "YOUTUBE" && concepto == "VISUALIZACIONES")
        {
            visualizaciones = {
                stoi(enero),
                stoi(febrero),
                stoi(marzo),
                stoi(abril),
                stoi(mayo),
                stoi(junio),
                stoi(julio),
                stoi(agosto),
                stoi(septiembre),
                stoi(octubre),
                stoi(noviembre),
                stoi(diciembre)
            };
        }
    }

    archivo.close();

    int diferenciaFollowers = followersJunio - followersEnero;
    cout << "Diferencia de Followers en Twitter entre enero y junio: " << diferenciaFollowers << endl;
    float promedioCrecimientoTwitter = crecimientoTwitter / meses;
    float promedioCrecimientoFacebook = crecimientoFacebook / meses;
    cout << "Promedio de crecimiento en Twitter entre enero y junio: " << promedioCrecimientoTwitter << " por mes" << endl;
    cout << "Promedio de crecimiento en Facebook entre enero y junio: " << promedioCrecimientoFacebook << " por mes" << endl;
    cout << "Entre cuantos meses desea promediar los <me gusta>: ";
    cin >> mpf;
    cout << "Promedio de me gusta en Facebook: " << megustaFacebook / mpf << endl;
    cout << "Promedio de me gusta en Twitter: " << megustaTwitter / mpf << endl;
    cout << "Promedio de me gusta en YouTube: " << megustaYoutube / mpf << endl;

    cout << "Digite el primer mes del que desea calcular diferencia de visualizaciones en YouTube (1 es enero, 12 es diciembre): ";
    cin >> mesInicio;
    cout << "Digite el segundo mes del que desea calcular diferencia de visualizaciones en YouTube (1 es enero, 12 es diciembre): ";
    cin >> mesFinal;

    mesInicio -= 1;
    mesFinal -= 1;

    dvy = visualizaciones[mesInicio];
    dvy2 = visualizaciones[mesFinal];

    int diferenciaVisualizaciones = dvy2 - dvy;

    if (diferenciaVisualizaciones < 0)
    {
        diferenciaVisualizaciones = -diferenciaVisualizaciones;
    }

    cout << "Diferencia de visualizaciones en YouTube entre el mes " << mesInicio + 1 << " y el mes " << mesFinal + 1 << ": " << diferenciaVisualizaciones << endl;

    return 0;
}


