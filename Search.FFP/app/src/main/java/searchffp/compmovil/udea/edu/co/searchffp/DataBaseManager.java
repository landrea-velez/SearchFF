package searchffp.compmovil.udea.edu.co.searchffp;

/**
 * SE ENCARGA DE DEFINR EL NOMBRE Y LOS CAMPOS DE LA TABLA
 * Y UTILZAR LOS METODOS DE INSERTAR, BORRAR, BUSCAR DATOS CONCRETOS DE LA TABLA
 * (CRUD)
 */
public class DataBaseManager {
    //EL NOMBRE DE LA TABLA
    public static final String TABLE_NAME= "local";

    //LOS CAMPOS
    //NOMBRE DE LA COLUMNAS
    public static final String CN_ID = "_id";
    public static final String CN_NAME = "nombre";
    public static final String CN_CITY = "ciudad";
    public static final String CN_LOCAT = "ubicacion";
    public static final String CN_PHONE = "telefono";

    /*create table local(
            _id integer primary key autoincrement,
            nombre text not null,
            ciudad text,
            ubicación text not null,
            telefono text);*/


    public static final String CREATE_TABLE = "create table " + TABLE_NAME + " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " text not null,"
            + CN_CITY + " text,"
            + CN_LOCAT + " text not null,"
            + CN_PHONE + " text);";
}
