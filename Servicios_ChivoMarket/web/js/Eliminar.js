$(document).ready(function () {
                                    $("tr #elimino").click(function (e) {
                                        e.preventDefault();
                                        var ID = $(this).parent().find('#ID').val();
                                        var ID_USER = $(this).parent().find('#ID_USER').val();
                                        var ID_Producto = $(this).parent().find('#ID_Productos').val();
                                        var Cantidad = $(this).parent().find('#Cantidad').val();
                                        swal({

                                            title: "Estas seguro?",
                                            text: "Una vez eliminado el producto, tendras que volverlo a agregar al carrito",
                                            icon: "warning",
                                            buttons: true,
                                            dangerMode: true,
                                            timer: 500000,
                                        })
                                                .then((willDelete) => {
                                                    if (willDelete) {
                                                        swal("Se ha eliminado con exito!!!", {
                                                            icon: "success",
                                                        });
                                                    } else {
                                                        swal("Se ha cancela el borrado");
                                                    }
                                                });
                                    });
                                    function EliminarUsuario(ID,ID_USER,ID_Producto,Cantidad){
                                         
                                    }
                                });



