package kotlin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.rewrapCtorProblem;
import kotlin.setSelectionFlags;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemRequestMetadataExternalSyntheticLambda0 {
    private final List<RemoteActionCompatParcelizer<?, ?>> AudioAttributesCompatParcelizer;
    private final rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> AudioAttributesImplBaseParcelizer;
    private final Set<RemoteActionCompatParcelizer<?, ?>> RemoteActionCompatParcelizer;
    private final IconCompatParcelizer read;
    private static final IconCompatParcelizer write = new IconCompatParcelizer();
    private static final MediaItemLocalConfigurationExternalSyntheticLambda0<Object, Object> IconCompatParcelizer = new read();

    public MediaItemRequestMetadataExternalSyntheticLambda0(rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer) {
        this(iconCompatParcelizer, write);
    }

    private MediaItemRequestMetadataExternalSyntheticLambda0(rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2) {
        this.AudioAttributesCompatParcelizer = new ArrayList();
        this.RemoteActionCompatParcelizer = new HashSet();
        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
        this.read = iconCompatParcelizer2;
    }

    final <Model, Data> void write(Class<Model> cls, Class<Data> cls2, setTargetOffsetMs<? extends Model, ? extends Data> settargetoffsetms) {
        synchronized (this) {
            read(cls, cls2, settargetoffsetms);
        }
    }

    private <Model, Data> void read(Class<Model> cls, Class<Data> cls2, setTargetOffsetMs<? extends Model, ? extends Data> settargetoffsetms) {
        RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer = new RemoteActionCompatParcelizer<>(cls, cls2, settargetoffsetms);
        List<RemoteActionCompatParcelizer<?, ?>> list = this.AudioAttributesCompatParcelizer;
        list.add(list.size(), remoteActionCompatParcelizer);
    }

    final <Model, Data> List<setTargetOffsetMs<? extends Model, ? extends Data>> AudioAttributesCompatParcelizer(Class<Model> cls, Class<Data> cls2, setTargetOffsetMs<? extends Model, ? extends Data> settargetoffsetms) {
        List<setTargetOffsetMs<? extends Model, ? extends Data>> listWrite;
        synchronized (this) {
            listWrite = write(cls, cls2);
            write(cls, cls2, settargetoffsetms);
        }
        return listWrite;
    }

    private <Model, Data> List<setTargetOffsetMs<? extends Model, ? extends Data>> write(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator<RemoteActionCompatParcelizer<?, ?>> it = this.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer<?, ?> next = it.next();
                if (next.read(cls, cls2)) {
                    it.remove();
                    arrayList.add(read(next));
                }
            }
        }
        return arrayList;
    }

    final <Model> List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, ?>> RemoteActionCompatParcelizer(Class<Model> cls) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                for (RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer : this.AudioAttributesCompatParcelizer) {
                    if (!this.RemoteActionCompatParcelizer.contains(remoteActionCompatParcelizer) && remoteActionCompatParcelizer.RemoteActionCompatParcelizer(cls)) {
                        this.RemoteActionCompatParcelizer.add(remoteActionCompatParcelizer);
                        arrayList.add(IconCompatParcelizer(remoteActionCompatParcelizer));
                        this.RemoteActionCompatParcelizer.remove(remoteActionCompatParcelizer);
                    }
                }
            } catch (Throwable th) {
                this.RemoteActionCompatParcelizer.clear();
                throw th;
            }
        }
        return arrayList;
    }

    final List<Class<?>> IconCompatParcelizer(Class<?> cls) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer : this.AudioAttributesCompatParcelizer) {
                if (!arrayList.contains(remoteActionCompatParcelizer.IconCompatParcelizer) && remoteActionCompatParcelizer.RemoteActionCompatParcelizer(cls)) {
                    arrayList.add(remoteActionCompatParcelizer.IconCompatParcelizer);
                }
            }
        }
        return arrayList;
    }

    public final <Model, Data> MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data> IconCompatParcelizer(Class<Model> cls, Class<Data> cls2) {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer : this.AudioAttributesCompatParcelizer) {
                    if (this.RemoteActionCompatParcelizer.contains(remoteActionCompatParcelizer)) {
                        z = true;
                    } else if (remoteActionCompatParcelizer.read(cls, cls2)) {
                        this.RemoteActionCompatParcelizer.add(remoteActionCompatParcelizer);
                        arrayList.add(IconCompatParcelizer(remoteActionCompatParcelizer));
                        this.RemoteActionCompatParcelizer.remove(remoteActionCompatParcelizer);
                    }
                }
                if (arrayList.size() > 1) {
                    return IconCompatParcelizer.RemoteActionCompatParcelizer(arrayList, this.AudioAttributesImplBaseParcelizer);
                }
                if (arrayList.size() == 1) {
                    return (MediaItemLocalConfigurationExternalSyntheticLambda0) arrayList.get(0);
                }
                if (z) {
                    return AudioAttributesCompatParcelizer();
                }
                throw new setSelectionFlags.RemoteActionCompatParcelizer((Class<?>) cls, (Class<?>) cls2);
            } catch (Throwable th) {
                this.RemoteActionCompatParcelizer.clear();
                throw th;
            }
        }
    }

    private static <Model, Data> setTargetOffsetMs<Model, Data> read(RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer) {
        return (setTargetOffsetMs<Model, Data>) remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    private <Model, Data> MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data> IconCompatParcelizer(RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer) {
        return (MediaItemLocalConfigurationExternalSyntheticLambda0) moveMediaSource.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer.write(this));
    }

    private static <Model, Data> MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data> AudioAttributesCompatParcelizer() {
        return (MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data>) IconCompatParcelizer;
    }

    static class RemoteActionCompatParcelizer<Model, Data> {
        private final Class<Model> AudioAttributesCompatParcelizer;
        final Class<Data> IconCompatParcelizer;
        final setTargetOffsetMs<? extends Model, ? extends Data> RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(Class<Model> cls, Class<Data> cls2, setTargetOffsetMs<? extends Model, ? extends Data> settargetoffsetms) {
            this.AudioAttributesCompatParcelizer = cls;
            this.IconCompatParcelizer = cls2;
            this.RemoteActionCompatParcelizer = settargetoffsetms;
        }

        public final boolean read(Class<?> cls, Class<?> cls2) {
            return RemoteActionCompatParcelizer(cls) && this.IconCompatParcelizer.isAssignableFrom(cls2);
        }

        public final boolean RemoteActionCompatParcelizer(Class<?> cls) {
            return this.AudioAttributesCompatParcelizer.isAssignableFrom(cls);
        }
    }

    static class IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        public static <Model, Data> access4600<Model, Data> RemoteActionCompatParcelizer(List<MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data>> list, rewrapCtorProblem.IconCompatParcelizer<List<Throwable>> iconCompatParcelizer) {
            return new access4600<>(list, iconCompatParcelizer);
        }
    }

    static class read implements MediaItemLocalConfigurationExternalSyntheticLambda0<Object, Object> {
        @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
        public final boolean read(Object obj) {
            return false;
        }

        @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
        public final MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Object> write(Object obj, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
            return null;
        }

        read() {
        }
    }
}
