package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getNavDrawerItems<M extends Member> implements getDefaultBottomTab<M> {
    private final boolean AudioAttributesCompatParcelizer;
    private final write read;
    private final getDefaultBottomTab<M> write;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[LOOP:0: B:42:0x00cc->B:44:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public getNavDrawerItems(kotlin.getTestHeaderTitle r9, kotlin.getDefaultBottomTab<? extends M> r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getNavDrawerItems.<init>(o.getTestHeaderTitle, o.getDefaultBottomTab, boolean):void");
    }

    @Override // kotlin.getDefaultBottomTab
    public final M write() {
        return (M) this.write.write();
    }

    @Override // kotlin.getDefaultBottomTab
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final Type getWrite() {
        return this.write.getWrite();
    }

    @Override // kotlin.getDefaultBottomTab
    public final List<Type> IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    static final class write {
        private final newEncryptedObject AudioAttributesCompatParcelizer;
        private final Method RemoteActionCompatParcelizer;
        private final Method[] write;

        public write(newEncryptedObject newencryptedobject, Method[] methodArr, Method method) {
            toMagicModuleMetaRepoModel.write(newencryptedobject, "");
            toMagicModuleMetaRepoModel.write(methodArr, "");
            this.AudioAttributesCompatParcelizer = newencryptedobject;
            this.write = methodArr;
            this.RemoteActionCompatParcelizer = method;
        }

        public final newEncryptedObject RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final Method[] IconCompatParcelizer() {
            return this.write;
        }

        public final Method write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Override // kotlin.getDefaultBottomTab
    public final Object RemoteActionCompatParcelizer(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        toMagicModuleMetaRepoModel.write(objArr, "");
        write writeVar = this.read;
        newEncryptedObject newencryptedobjectRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
        Method[] methodArrIconCompatParcelizer = writeVar.IconCompatParcelizer();
        Method methodWrite = writeVar.write();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        int read = newencryptedobjectRemoteActionCompatParcelizer.getRead();
        int audioAttributesCompatParcelizer = newencryptedobjectRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
        if (read <= audioAttributesCompatParcelizer) {
            while (true) {
                Method method = methodArrIconCompatParcelizer[read];
                Object objIconCompatParcelizer = objArr[read];
                if (method != null) {
                    if (objIconCompatParcelizer != null) {
                        objIconCompatParcelizer = method.invoke(objIconCompatParcelizer, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(returnType, "");
                        objIconCompatParcelizer = getCourseStrings.IconCompatParcelizer((Type) returnType);
                    }
                }
                objArrCopyOf[read] = objIconCompatParcelizer;
                if (read == audioAttributesCompatParcelizer) {
                    break;
                }
                read++;
            }
        }
        Object objRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(objArrCopyOf);
        return (methodWrite == null || (objInvoke = methodWrite.invoke(null, objRemoteActionCompatParcelizer)) == null) ? objRemoteActionCompatParcelizer : objInvoke;
    }
}
