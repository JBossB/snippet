# Linux Consola

_Comandos Útiles para manejo de Máquinas Virtuales desde la consola de Linux_

## Cambiar Nombre del Hostname al momento de clonar una VM 🚀

_Estas instrucciones te permitirán modificar el nombre de una máquina virtual desde la consola._

### Alternativa 1 📋
***verificar***

```
hostnamectl
```
_ejecutar:_
```
hostnamectl set-hostname nombredelservidor
```

### Alternativa 2
_Para ver la configuración actual de tu sistema, usa el hostname sin ninguna opción ni argumento:_
```
hostname
```
Para cambiar el hostname, simplemente usa el comando hostname sin ninguna opción, escribiendo el nuevo nombre de host como único argumento.
```
hostname hostinger
```