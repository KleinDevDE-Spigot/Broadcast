# ================================= #
#   __   __          _   _   _      #
#   \ \ / /         | | (_) | |     #
#    \ V /   _   _  | |  _  | |_    #
#     > <   | | | | | | | | | __|   #
#    / . \  | |_| | | | | | | |_    #
#   /_/ \_\  \__, | |_| |_|  \__|   #
#             __/ |                 #
#            |___/                  #
#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#
#          Powered by Xylit         #
# ================================= #
SpigotDEV -> https://www.spigotmc.org/resources/authors/xylit.265936/
BukkitDEV -> https://dev.bukkit.org/members/MCR_Xylit
MinecronDEV -> https://dev.minecron.de/user/Xylit (Coming Soon)
Maxcron -> https://maxcron.de/user/Xylit (Coming Soon)



Configuration
================

Message:
  >> Available Parameters:
     - %player%
     - %time%
     - %message%

   %player% -> Replace with the Name of the Broadcast Sender
   %time% -> Replace with the actually System-Time HH:mm
   %message% -> Replace with the Broadcast Message

  >> Example:
     - "&8[&3Broadcast&8] &f%message%"
     - "&6%player% &3>> &f%message%"
     - "&6Broadcast &3>> &f%message%"
     - "&7[%time%] &6Broadcast &3>> &f%message%"

Permission:
 >> PermissionBase:
      The Permission for the /bc Command
  
 >> PermissionBypass:
      Players with these Permission, don't receive the Broadcast
      IMPORTANT! > User with * Permission cant see the Broadcast, because they have the Bypass-Permission.
                 > Remove the Bypass Permission from your Group/Player

 >> PermissionReload:
      The Permission for the /bcreload Command
 
 >> PermissionUpdate:
      The Permission for the /bcupdate Command

 >> PermissionNotifyUpdate
      Notify on Login if Update is available