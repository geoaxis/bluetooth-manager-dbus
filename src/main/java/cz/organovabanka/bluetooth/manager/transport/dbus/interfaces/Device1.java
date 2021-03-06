package cz.organovabanka.bluetooth.manager.transport.dbus.interfaces;

/*-
 * #%L
 * org.sputnikdev:bluetooth-manager-dbus
 * %%
 * Copyright (C) 2018 Lukas Rucka
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.freedesktop.DBus;
import org.freedesktop.dbus.DBusInterface;
import org.freedesktop.dbus.DBusInterfaceName;

import cz.organovabanka.bluetooth.manager.transport.dbus.BluezCommons;

/**
 * Interface mirroring Bluez device interface methods.
 * @author Lukas Rucka
 */
@DBusInterfaceName(BluezCommons.BLUEZ_IFACE_DEVICE)
public interface Device1 extends DBusInterface {
    void Disconnect();

    void Connect();
}


