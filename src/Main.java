//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Aplicacion aplicacion1 = new Aplicacion("AppStore","1.0");
    Aplicacion aplicacion2 = new Aplicacion("Youtube","5.0");

    System.out.println("Nombre: " + aplicacion1.getNombre());
    System.out.println("Version: " + aplicacion1.getVersion());

    System.out.println("Nombre: " + aplicacion2.getNombre());
    System.out.println("Version: " + aplicacion2.getVersion());

    System.out.println("Total de aplicaciones es de: " + Aplicacion.ElTotalAplicaciones());




}
