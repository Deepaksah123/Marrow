package kotlin;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface _fromWellKnownInterface {
    long IconCompatParcelizer();

    void IconCompatParcelizer(Handler handler, IconCompatParcelizer iconCompatParcelizer);

    void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer);

    TypeNameIdResolver RemoteActionCompatParcelizer();

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(int i, long j, long j2);

        public static final class write {
            private final CopyOnWriteArrayList<C0057write> AudioAttributesCompatParcelizer = new CopyOnWriteArrayList<>();

            public final void RemoteActionCompatParcelizer(Handler handler, IconCompatParcelizer iconCompatParcelizer) {
                RemoteActionCompatParcelizer(iconCompatParcelizer);
                this.AudioAttributesCompatParcelizer.add(new C0057write(handler, iconCompatParcelizer));
            }

            public final void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
                for (C0057write c0057write : this.AudioAttributesCompatParcelizer) {
                    if (c0057write.read == iconCompatParcelizer) {
                        c0057write.write();
                        this.AudioAttributesCompatParcelizer.remove(c0057write);
                    }
                }
            }

            public final void write(final int i, final long j, final long j2) {
                for (final C0057write c0057write : this.AudioAttributesCompatParcelizer) {
                    if (!c0057write.RemoteActionCompatParcelizer) {
                        c0057write.IconCompatParcelizer.post(new Runnable() { // from class: o._fromWellKnownClass
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0057write.read.IconCompatParcelizer(i, j, j2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: renamed from: o._fromWellKnownInterface$IconCompatParcelizer$write$write, reason: collision with other inner class name */
            static final class C0057write {
                private final Handler IconCompatParcelizer;
                private boolean RemoteActionCompatParcelizer;
                private final IconCompatParcelizer read;

                public C0057write(Handler handler, IconCompatParcelizer iconCompatParcelizer) {
                    this.IconCompatParcelizer = handler;
                    this.read = iconCompatParcelizer;
                }

                public final void write() {
                    this.RemoteActionCompatParcelizer = true;
                }
            }
        }
    }
}
