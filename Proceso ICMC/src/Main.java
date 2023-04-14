import java.util.*;

public class Main {

	static int sec = 0, sec1 = 0, x = 0;
	static int opc, pregunta, documento;
	static boolean cliente;
	static Scanner sn = new Scanner(System.in);
	static Scanner cn = new Scanner(System.in);
	static Timer time = new Timer();
	static Timer time1 = new Timer();
	static Timer time2 = new Timer();
	static Timer time3 = new Timer();
	static Timer time4 = new Timer();
	static Timer time5 = new Timer();
	static Timer time6 = new Timer();
	static Timer time7 = new Timer();
	static Timer time8 = new Timer();
	static Timer time9 = new Timer();
	static Timer time10 = new Timer();
	static Timer time11 = new Timer();
	static Timer time12 = new Timer();
	static Timer time13 = new Timer();
	static Timer time14 = new Timer();
	static Timer time15 = new Timer();
	static Timer time16 = new Timer();
	static Timer time17 = new Timer();
	static Timer time18 = new Timer();
	static Timer time19 = new Timer();
	static Timer time20 = new Timer();
	static Timer time21 = new Timer();
	static Timer time22 = new Timer();
	static Timer time23 = new Timer();
	static String nombre, direccion;

	public static void main(String[] args) {
		proceso();
	}

	public static void proceso() {
		cn.useDelimiter("\n");
		boolean salir = true;
		System.out.print("Bienvenido a ORANGE");
		while (salir == true) {
			System.out.print("\nSi usted es cliente nuevo digite: 1");
			System.out.print("\nSi usted no es cliente nuevo digite: 2");
			System.out.print("\nDigite la opción: ");
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				cliente = true;
				nuevoC();
				salir = false;
				break;
			case 2:
				cliente = false;
				mantenimiento1();
				salir = false;
				break;
			default:
				System.out.print("\nERROR: Digito una opción incorrecta");
				break;
			}
		}
	}

	public static void nuevoC() {
		System.out.print("\nRegistro de Datos Cliente Nuevo");
		System.out.print("\nDigite su nombre: ");
		nombre = cn.nextLine();
		System.out.print("Digite su numero de documento: ");
		documento = sn.nextInt();
		System.out.print("Digite su dirección de residencia o trabajo: ");
		direccion = cn.nextLine();
		System.out.print("\nPreparando y reliazando visita de captación...");
		sec = 3;
		TimerTask tarea = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					System.out.print("\nVisita de captación: Exitosa.");
					System.out.print("\nRegistro de datos de la visita: Realizado y Guardado.");
					interesadoS();
				}
			}
		};
		time.schedule(tarea, 500, 1000);
	}

	public static void interesadoS() {
		boolean salir = true;
		while (salir == true) {
			System.out.print("\n¿El cliente desea los sevicios ofrecidos?");
			System.out.print("\nSi(1) No(2): ");
			pregunta = sn.nextInt();
			if (pregunta == 1) {
				mantenimiento1();
				salir = false;
			} else if (pregunta == 2) {
				System.out.print("\nOk, no hay problema.");
				System.out.print("\nCliente registrado y guardado como: Registro de Captación fallida");
				System.out.print("\nServicio Finalizado. Vuelva pronto.");
				System.exit(-1);
				salir = false;
			} else {
				System.out.print("\nERROR: Opción incorrecta");
			}
		}
	}

	public static void condiciones() {
		System.out.print("\n¿Las condiciones pactadas con el cliente han cambiado?");
		System.out.print("\nSi(1) No(2): ");
		pregunta = sn.nextInt();
		switch (pregunta) {
		case 1:
			viabilidad();
			break;
		case 2:
			clienteN();
			break;
		default:
			System.out.print("\nERROR: Opción incorrecta");
			condiciones();
			break;
		}
	}

	public static void clienteN() {
		System.out.print("\n\nComo las condiciones pactadas cambiaron,");
		System.out.print("\nse verifica de que el cliente no sea nuevo...");
		sec = 3;
		TimerTask tarea = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					time3.cancel();
				}
			}
		};
		time3.schedule(tarea, 500, 1000);
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				if (cliente == true) {
					System.out.print("\nEl cliente es Nuevo.");
					captacion();
				} else {
					System.out.print("\nEl cliente no es Nuevo.");
					mantenimiento2();
				}
			}
		};
		time5.schedule(tarea1, 3500);
	}

	public static void viabilidad() {
		System.out.print("\nAntes de continuar primero hay que estudiar la viabilidad del servicio.");
		System.out.print("\n¿El servicio es viable?");
		System.out.print("\nSi(1) No(2): ");
		pregunta = sn.nextInt();
		if (pregunta == 1) {
			rentabilidad();
		} else if (pregunta == 2) {
			servicioN();
		} else {
			System.out.print("\nERROR: Opción incorrecta");
			viabilidad();
		}
	}

	public static void servicioN() {
		System.out.print("\n¿El servicio solicitado es nuevo?");
		System.out.print("\nSi(1) No(2): ");
		pregunta = sn.nextInt();
		if (pregunta == 1) {
			captacionF();
		} else if (pregunta == 2) {
			viabilidad();
		} else {
			System.out.print("\nERROR: Opción incorrecta");
			servicioN();
		}
	}

	public static void rentabilidad() {
		System.out.print("\nAntes de continuar hay que estudiar la rentabilidad del servicio.");
		System.out.print("\n¿El servicio es rentable?");
		System.out.print("\nSi(1) No(2): ");
		pregunta = sn.nextInt();
		if (pregunta == 1) {
			ofertaP();
		} else if (pregunta == 2) {
			perdidaS();
		} else {
			System.out.print("\nERROR: Opción incorrecta");
			rentabilidad();
		}
	}

	public static void ofertaP() {
		System.out.print("\nElaboración y entrega de oferta personalizada al cliente...");
		sec = 3;
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					System.out.print("\nElaboración de oferta personalizada: Exitosa.");
					System.out.print("\nEnvio de oferta personalizada al cliente: Resivida.");
					ofertaA();
					time11.cancel();
				}
			}
		};
		time11.schedule(tarea1, 500, 1000);
	}

	public static void ofertaA() {
		System.out.print("\n¿Cliente acepta oferta personalizada?");
		System.out.print("\nSi(1) No(2): ");
		pregunta = sn.nextInt();
		if (pregunta == 1) {
			soporteO();
		} else if (pregunta == 2) {
			ofertaN();
		} else {
			System.out.print("\nERROR: Opción incorrecta");
			ofertaA();
		}
	}

	public static void ofertaN() {
		System.out.print("\nNegociación de acuerdo de oferta...");
		sec = 3;
		TimerTask tarea = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					time15.cancel();
				}
			}
		};
		time15.schedule(tarea, 500, 1000);
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				nuevaO();
			}
		};
		time16.schedule(tarea1, 3500);
	}

	public static void mantenimiento1() {
		System.out.print("\nPreparando y reliazando visita de mantenimiento...");
		sec = 3;
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					System.out.print("\nVisita de mantenimiento: Exitosa.");
					System.out.print("\nRegistro de datos de la visita: Realizado y Guardado.");
					condiciones();
					time.cancel();
				}
			}
		};
		time.schedule(tarea1, 500, 1000);
	}

	public static void mantenimiento2() {
		System.out.print("\nPreparando y reliazando visita de mantenimiento...");
		sec = 3;
		TimerTask tarea2 = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					time23.cancel();
				}
			}
		};
		time23.schedule(tarea2, 500, 1000);
		TimerTask tarea3 = new TimerTask() {
			@Override
			public void run() {
				System.out.print("\nVisita de mantenimiento: Exitosa.");
				System.out.print("\nRegistro de datos de la visita: Realizado y Guardado.");
				System.out.print("\nEnvio de registro al Departamento comercial: Finalizado.");
				System.out.print("\nServicio Finalizado. Vuelva pronto.");
				System.exit(-1);
			}
		};
		time22.schedule(tarea3, 3500);
	}

	public static void captacion() {
		System.out.print("\nCliente nuevo se registra como: Cliente captado");
		System.out.print("\nPreparando y reliazando visita de captación...");
		sec = 3;
		TimerTask tarea = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					time7.cancel();
				}
			}
		};
		time7.schedule(tarea, 500, 1000);
		TimerTask tarea2 = new TimerTask() {
			@Override
			public void run() {
				System.out.print("\nVisita de captación: Exitosa.");
				System.out.print("\nRegistro de datos de la visita: Realizado y Guardado.");
				System.out.print("\nEnvio de registro de datos al Departamento comercial: Terminado");
				System.out.print("\nServicio Finalizado. Vuelva pronto.");
				System.exit(-1);
			}
		};
		time6.schedule(tarea2, 3500);
	}

	public static void captacionF() {
		System.out.print("\nServicio registrado como: Captación Fallida");
		System.out.print("\nGenerando informe del servicio...");
		sec = 3;
		TimerTask tarea = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					time1.cancel();
				}
			}
		};
		time1.schedule(tarea, 500, 1000);
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				capF();
			}
		};
		time2.schedule(tarea1, 3500);
	}

	public static void capF() {
		System.out.print("\nInforme del servicio: Generado.");
		System.out.print("\nEnvio de informe al Departamento comercial...");
		sec = 3;
		TimerTask tarea3 = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					System.out.print("\nEnvio de informe al Departamento comercial: Finalizado.");
					System.out.print("\nServicio Finalizado. Vuelva pronto.");
					System.exit(-1);
				}
			}
		};
		time4.schedule(tarea3, 500, 3000);
	}

	public static void perdidaS() {
		System.out.print("\nServicio registrado como: Perdida del servicio");
		System.out.print("\nGenerando documento del servicio...");
		sec = 3;
		TimerTask tarea = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					time8.cancel();
				}
			}
		};
		time8.schedule(tarea, 500, 1000);
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				perS();
			}
		};
		time9.schedule(tarea1, 3500);
	}

	public static void perS() {
		System.out.print("\nDocumento del servicio: Generado.");
		System.out.print("\nEnvio de documento al Departamento comercial...");
		sec = 3;
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					System.out.print("\nEnvio de documento al Departamento comercial: Finalizado.");
					System.out.print("\nServicio Finalizado. Vuelva pronto.");
					System.exit(-1);
				}
			}
		};
		time10.schedule(tarea1, 500, 1000);
	}

	public static void soporteO() {
		System.out.print("\nEnvio de soporte de oferta al Departamento de Ventas...");
		sec = 3;
		TimerTask tarea = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					time12.cancel();
				}
			}
		};
		time12.schedule(tarea, 500, 1000);
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				sopO();
			}
		};
		time13.schedule(tarea1, 3500);
	}

	public static void sopO() {
		System.out.print("\nEnvio de soporte de oferta al Departamento de Ventas: Exitoso.");
		System.out.print("\nEnvio de copia de soporte al Cliente...");
		sec = 3;
		TimerTask tarea2 = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					System.out.print("\nEnvio de copia soporte de oferta al Cliente: Exitoso.");
					System.out.print("\nServicio Finalizado. Vuelva pronto.");
					System.exit(-1);
				}
			}
		};
		time14.schedule(tarea2, 500, 1000);
	}

	public static void nuevaO() {
		try {
			System.out.print("\nNegociación de oferta realizada.");
			System.out.print("\n¿Cliente acepta nueva oferta?");
			System.out.print("\nSi(1) No(2): ");
			pregunta = sn.nextInt();
			if (pregunta == 1) {
				informe();
			} else if (pregunta == 2) {
				System.out.print("\nPresentando nueva oferta...");
				sec = 3;
				TimerTask tarea = new TimerTask() {
					@Override
					public void run() {
						if (sec > 0) {
							System.out.print("\nEn: " + sec);
							sec--;
						} else {
							time20.cancel();
						}
					}
				};
				time20.schedule(tarea, 500, 1000);
				TimerTask tarea1 = new TimerTask() {
					@Override
					public void run() {
						nuevaO();
					}
				};
				time21.schedule(tarea1, 3500);
			} else {
				System.out.print("\nERROR: Opción incorrecta");
			}
		} catch (Exception e) {
			System.out.print("\nOk, no hay problema.");
			System.out.print("\nServicio Finalizado. Vuelva pronto.");
			System.exit(-1);
		}
	}

	public static void informe() {
		System.out.print("\nGenerando informe de acuerdo de oferta...");
		sec = 3;
		TimerTask tarea = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					time17.cancel();
				}
			}
		};
		time17.schedule(tarea, 500, 1000);
		TimerTask tarea1 = new TimerTask() {
			@Override
			public void run() {
				inf();
			}
		};
		time18.schedule(tarea1, 3500);
	}

	public static void inf() {
		System.out.print("\nInforme generado: Exitoso.");
		System.out.print("\nEnvio de informe al Departamento de ventas...");
		sec = 3;
		TimerTask tarea2 = new TimerTask() {
			@Override
			public void run() {
				if (sec > 0) {
					System.out.print("\nEn: " + sec);
					sec--;
				} else {
					System.out.print("\nEnvio de informe: Exitoso.");
					System.out.print("\nServicio Finalizado. Vuelva pronto.");
					System.exit(-1);
				}
			}
		};
		time19.schedule(tarea2, 500, 1000);
	}
}
