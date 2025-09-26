
/**
 *
 * @author Dante Kaddarian
 * descomentar el ejercicio que se quiera probar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
//        Pasaporte pasaporte = new Pasaporte("AGR5617A", "2025/09/17", "Foto 1", "PNG");
//        System.out.println(pasaporte);
//        pasaporte.mostrarFoto();
//        
//        Titular titular = new Titular("Dante Kaddarian", "35459831");
//        titular.setPasaporte(pasaporte);
        
        //Comprobacion de asociacion bidireccional
//        System.out.println(pasaporte);
//        System.out.println(titular.getPasaporte().getNumero());
//        System.out.println(pasaporte.getTitular().getNombre());
        
        //Ejercicio 2
//        Bateria bateria = new Bateria("EB-BG950ABE", "4000 mAh");
//        Celular celular = new Celular("358762091234567", "Nokia", "1100", bateria); //agregacion
//        System.out.println(celular);
//        celular.mostrarBateria();
//        celular.setBateria(null); //elimino la referencia que es equivalente a remover la bateria
//        celular.mostrarBateria();
//        System.out.println(bateria); //se quito la bateria del celular pero igual la bateria sigue existiendo
        
//        Usuario usuario = new Usuario("Dante Kaddarian", "35459831");
//        usuario.setCelular(celular);
//        
//        //validacion de la relacion de ambos lados  
//        System.out.println(usuario);
//        System.out.println(usuario.getCelular().getModelo());
//        System.out.println(celular.getUsuario().getNombre());
        
        //Ejercicio 3
//        Editorial editorial = new Editorial("Silverleaf Publishing", "4512 Maple Avenue, Suite 200, Portland, OR 97205, USA");
//        Libro libro = new Libro("Como ganar amigos e influir en las personas", "978-1-23456-789-7", editorial);
//        System.out.println(libro);
//        libro.mostrarEditorial();
//        libro.setEditorial(null);
//        libro.mostrarEditorial();
//        System.out.println(editorial);  
//        
//        Autor autor = new Autor("Dale Carnegie", "Americano");
//        libro.setAutor(autor);
//        libro.mostrarAutor();
        
        //Ejercicio 4
//        Banco banco = new Banco("Santander", "24-35459831-7");
//        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4567456788590016", "02/30", banco);
//        tarjeta.mostrarBanco();
//        Cliente cliente = new Cliente("Dante Kaddarian", "35459831");
//        tarjeta.setCliente(cliente);
//        System.out.println("Tarjeta de Credito: " + tarjeta.getNumero());
//        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
//        System.out.println("Tarjeta Asociada al cliente: " + cliente.getTarjetaDeCredito().getNumero());
        
        //Ejercicio 5
//          Computadora computadora = new Computadora("HP", "156-G", "ASUS", "h610m-k");
//          System.out.println(computadora);
//          
//          Propietario propietario = new Propietario("Dante Kaddarian", "35459831");
//          computadora.setPropietario(propietario);
//          
//          System.out.println("Computadora: " + computadora.getMarca());
//          System.out.println("Propietario: " + computadora.getPropietario().getNombre());
//          System.out.println("Computadora Asociada al Propietario: " + propietario.getComputadora().getMarca());

        //Ejercicio 6
//            Mesa mesa = new Mesa(16, 6);
//            ClienteRestaurant cliente = new ClienteRestaurant("Dante Kaddarian", "1134961991");
//            Reserva reserva = new Reserva("23/09/25", "20hs" , mesa);
//            reserva.setCliente(cliente);
//            
//            reserva.mostrarCliente();
//            reserva.setCliente(null);
//            reserva.mostrarCliente();
//            System.out.println(cliente);
//
//            reserva.mostrarMesa();
//            reserva.setMesa(null);
//            reserva.mostrarMesa();
//            System.out.println(mesa);

        //Ejercicio 7
//              Motor motor = new Motor("Cummins", "MTR-8F2X-394721");
//              Vehiculo vehiculo = new Vehiculo("AK116II", "reightliner Cascadia 126", motor);
//              
//              vehiculo.mostrarMotor();
//              vehiculo.setMotor(null);
//              vehiculo.mostrarMotor();
//              System.out.println(motor);
//              
//              Conductor conductor = new Conductor("Dante Kaddarian", "B1");
//              conductor.setVehiculo(vehiculo);
//              System.out.println("Conductor: " + conductor.getNombre());
//              System.out.println("Vehiculo modelo: " + conductor.getVehiculo().getModelo());
//              System.out.println("Conductor Asociado al Vehiculo: " + vehiculo.getConductor().getNombre());
        //Ejercicio 8
//                Persona propietario = new Persona("Dante Kaddarian", "dante.kaddarian@tupad.utn.edu.ar");
//                Documento documento = new Documento("Titulo de Propiedad", "Contenido", "a830d7beb04eb7549ce990fb7dc962e499a27230d", "24/09/25", propietario);
//                
//                documento.mostrarFirma();
//                
//                documento.mostrarPersona();
//                documento.setPersona(null);
//                documento.mostrarPersona();
//                System.out.println(propietario);

        //Ejercicio 9
//                CitaMedica cita = new CitaMedica("24/09/25",21);
//                Paciente paciente = new Paciente("Dante Kaddarian", "SancorSalud");
//                Profesional profesional = new Profesional("Franco Arpone", "Odontologia");
//                cita.setPaciente(paciente);
//                cita.setProfesional(profesional);
//                
//                cita.mostrarPaciente();
//                cita.mostrarProfesional();
//                
//                cita.setPaciente(null);
//                cita.mostrarPaciente();
//                System.out.println(paciente);

        //Ejercicio 10
//                CuentaBancaria cuenta = new CuentaBancaria("000006546879967", 10000.0, "561g6rgrgg?", "24/09/25");
//                TitularCuenta titular = new TitularCuenta("Dante Kaddarian", "35459831");
//                
//                cuenta.mostrarClave();
//                cuenta.setClave("5gf(((0??/(", "24/09/25");
//                cuenta.mostrarClave();
//                
//                cuenta.setTitular(titular);
//                System.out.println("Cuenta Bancaria: " + cuenta.getCbu());
//                System.out.println("Titular Asociado: " + cuenta.getTitular().getNombre());
//                System.out.println("Cuenta Asociada al Titular:" + titular.getCuenta().getCbu());
           
    }

}

