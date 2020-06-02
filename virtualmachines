# Virtual Machine

_Comandos Útiles para manejo de Máquinas Virtuales_

## Ampliar Disco desde consola 🚀

_Estas instrucciones te permitirán modificar el tamaño del disco de una máquina virtual desde la consola y sin reiniciar el servidor padre._

### Paso 1 📋

_Modificar Tamaño del disco_
Tamaño en MB es decir 1GB es 1024MB
50GB son 51200

```
 VBoxManage modifyhd <Ruta Archivo VDI> --resize <Tamaño en MB>
```

_Desde la consola del servidor padre (root)_

```
VBoxManage modifyhd /home/vm/Disco.vdi --resize 51200
```

### Paso 2 📋
_ejecuta el live CD gparted.iso en la VM a la que modificaste el tamaño del disco_

```
Elimina partición Swap o reducela a 2GB
Amplía el tamaño de la partición primaria
Aplica los cambios
Quita el disco Live CD
reinicia la VM
Verifica con el comando **df -h**
```

_Fin del procedimiento_


---
⌨️ con ❤️ por [jbossb](https://github.com/jbossb) 😊
