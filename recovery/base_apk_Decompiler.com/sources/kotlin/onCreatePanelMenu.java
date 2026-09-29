package kotlin;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class onCreatePanelMenu {
    NioPathDeserializer AudioAttributesCompatParcelizer;
    private Interpolator IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private long write = -1;
    private final Java7SupportImpl AudioAttributesImplApi21Parcelizer = new Java7SupportImpl() { // from class: o.onCreatePanelMenu.4
        private boolean read = false;
        private int AudioAttributesCompatParcelizer = 0;

        @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
        public void read(View view) {
            if (this.read) {
                return;
            }
            this.read = true;
            if (onCreatePanelMenu.this.AudioAttributesCompatParcelizer != null) {
                onCreatePanelMenu.this.AudioAttributesCompatParcelizer.read(null);
            }
        }

        void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = 0;
            this.read = false;
            onCreatePanelMenu.this.read();
        }

        @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
        public void RemoteActionCompatParcelizer(View view) {
            int i = this.AudioAttributesCompatParcelizer + 1;
            this.AudioAttributesCompatParcelizer = i;
            if (i == onCreatePanelMenu.this.read.size()) {
                if (onCreatePanelMenu.this.AudioAttributesCompatParcelizer != null) {
                    onCreatePanelMenu.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(null);
                }
                RemoteActionCompatParcelizer();
            }
        }
    };
    final ArrayList<findTransient> read = new ArrayList<>();

    public onCreatePanelMenu write(findTransient findtransient) {
        if (!this.RemoteActionCompatParcelizer) {
            this.read.add(findtransient);
        }
        return this;
    }

    public onCreatePanelMenu write(findTransient findtransient, findTransient findtransient2) {
        this.read.add(findtransient);
        findtransient2.RemoteActionCompatParcelizer(findtransient.IconCompatParcelizer());
        this.read.add(findtransient2);
        return this;
    }

    public void write() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        for (findTransient findtransient : this.read) {
            long j = this.write;
            if (j >= 0) {
                findtransient.write(j);
            }
            Interpolator interpolator = this.IconCompatParcelizer;
            if (interpolator != null) {
                findtransient.RemoteActionCompatParcelizer(interpolator);
            }
            if (this.AudioAttributesCompatParcelizer != null) {
                findtransient.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            }
            findtransient.AudioAttributesCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer = true;
    }

    void read() {
        this.RemoteActionCompatParcelizer = false;
    }

    public void IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            Iterator<findTransient> it = this.read.iterator();
            while (it.hasNext()) {
                it.next().write();
            }
            this.RemoteActionCompatParcelizer = false;
        }
    }

    public onCreatePanelMenu read(long j) {
        if (!this.RemoteActionCompatParcelizer) {
            this.write = j;
        }
        return this;
    }

    public onCreatePanelMenu AudioAttributesCompatParcelizer(Interpolator interpolator) {
        if (!this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer = interpolator;
        }
        return this;
    }

    public onCreatePanelMenu write(NioPathDeserializer nioPathDeserializer) {
        if (!this.RemoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = nioPathDeserializer;
        }
        return this;
    }
}
