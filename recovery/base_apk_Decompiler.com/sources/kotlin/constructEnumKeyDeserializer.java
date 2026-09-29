package kotlin;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import kotlin.StdScalarDeserializer;
import kotlin.StdValueInstantiator;

/* JADX INFO: loaded from: classes2.dex */
final class constructEnumKeyDeserializer {
    private final Executor IconCompatParcelizer;
    private final StdScalarDeserializer.write write;

    constructEnumKeyDeserializer(StdScalarDeserializer.write writeVar, Executor executor) {
        this.write = writeVar;
        this.IconCompatParcelizer = executor;
    }

    private void RemoteActionCompatParcelizer(final Typeface typeface) {
        final StdScalarDeserializer.write writeVar = this.write;
        this.IconCompatParcelizer.execute(new Runnable() { // from class: o.constructEnumKeyDeserializer.3
            @Override // java.lang.Runnable
            public final void run() {
                writeVar.read(typeface);
            }
        });
    }

    private void RemoteActionCompatParcelizer(final int i) {
        final StdScalarDeserializer.write writeVar = this.write;
        this.IconCompatParcelizer.execute(new Runnable() { // from class: o.constructEnumKeyDeserializer.2
            @Override // java.lang.Runnable
            public final void run() {
                writeVar.AudioAttributesCompatParcelizer(i);
            }
        });
    }

    final void IconCompatParcelizer(StdValueInstantiator.read readVar) {
        if (readVar.RemoteActionCompatParcelizer()) {
            RemoteActionCompatParcelizer(readVar.IconCompatParcelizer);
        } else {
            RemoteActionCompatParcelizer(readVar.read);
        }
    }
}
