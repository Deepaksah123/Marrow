package kotlin;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
public class mapObject {
    private final CopyOnWriteArrayList<UntypedObjectDeserializerNRScope> AudioAttributesCompatParcelizer = new CopyOnWriteArrayList<>();
    private final Map<UntypedObjectDeserializerNRScope, RemoteActionCompatParcelizer> IconCompatParcelizer = new HashMap();
    private final Runnable RemoteActionCompatParcelizer;

    public mapObject(Runnable runnable) {
        this.RemoteActionCompatParcelizer = runnable;
    }

    public final void read(Menu menu) {
        Iterator<UntypedObjectDeserializerNRScope> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(menu);
        }
    }

    public final void write(Menu menu, MenuInflater menuInflater) {
        Iterator<UntypedObjectDeserializerNRScope> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer(menu, menuInflater);
        }
    }

    public final boolean AudioAttributesCompatParcelizer(MenuItem menuItem) {
        Iterator<UntypedObjectDeserializerNRScope> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            if (it.next().RemoteActionCompatParcelizer(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void write(Menu menu) {
        Iterator<UntypedObjectDeserializerNRScope> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().read(menu);
        }
    }

    public final void AudioAttributesCompatParcelizer(UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope) {
        this.AudioAttributesCompatParcelizer.add(untypedObjectDeserializerNRScope);
        this.RemoteActionCompatParcelizer.run();
    }

    public final void read(final UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope, hasGetter hasgetter) {
        AudioAttributesCompatParcelizer(untypedObjectDeserializerNRScope);
        anyIgnorals lifecycle = hasgetter.getLifecycle();
        RemoteActionCompatParcelizer remoteActionCompatParcelizerRemove = this.IconCompatParcelizer.remove(untypedObjectDeserializerNRScope);
        if (remoteActionCompatParcelizerRemove != null) {
            remoteActionCompatParcelizerRemove.AudioAttributesCompatParcelizer();
        }
        this.IconCompatParcelizer.put(untypedObjectDeserializerNRScope, new RemoteActionCompatParcelizer(lifecycle, new findAccess() { // from class: o._mapObjectWithDups
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter2, anyIgnorals.read readVar) {
                this.AudioAttributesCompatParcelizer.write(untypedObjectDeserializerNRScope, readVar);
            }
        }));
    }

    final /* synthetic */ void write(UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope, anyIgnorals.read readVar) {
        if (readVar == anyIgnorals.read.ON_DESTROY) {
            IconCompatParcelizer(untypedObjectDeserializerNRScope);
        }
    }

    public final void IconCompatParcelizer(final UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope, hasGetter hasgetter, final anyIgnorals.write writeVar) {
        anyIgnorals lifecycle = hasgetter.getLifecycle();
        RemoteActionCompatParcelizer remoteActionCompatParcelizerRemove = this.IconCompatParcelizer.remove(untypedObjectDeserializerNRScope);
        if (remoteActionCompatParcelizerRemove != null) {
            remoteActionCompatParcelizerRemove.AudioAttributesCompatParcelizer();
        }
        this.IconCompatParcelizer.put(untypedObjectDeserializerNRScope, new RemoteActionCompatParcelizer(lifecycle, new findAccess() { // from class: o.mapArrayToArray
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter2, anyIgnorals.read readVar) {
                this.write.IconCompatParcelizer(writeVar, untypedObjectDeserializerNRScope, readVar);
            }
        }));
    }

    final /* synthetic */ void IconCompatParcelizer(anyIgnorals.write writeVar, UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope, anyIgnorals.read readVar) {
        if (readVar == anyIgnorals.read.AudioAttributesCompatParcelizer(writeVar)) {
            AudioAttributesCompatParcelizer(untypedObjectDeserializerNRScope);
            return;
        }
        if (readVar == anyIgnorals.read.ON_DESTROY) {
            IconCompatParcelizer(untypedObjectDeserializerNRScope);
        } else if (readVar == anyIgnorals.read.RemoteActionCompatParcelizer(writeVar)) {
            this.AudioAttributesCompatParcelizer.remove(untypedObjectDeserializerNRScope);
            this.RemoteActionCompatParcelizer.run();
        }
    }

    public final void IconCompatParcelizer(UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope) {
        this.AudioAttributesCompatParcelizer.remove(untypedObjectDeserializerNRScope);
        RemoteActionCompatParcelizer remoteActionCompatParcelizerRemove = this.IconCompatParcelizer.remove(untypedObjectDeserializerNRScope);
        if (remoteActionCompatParcelizerRemove != null) {
            remoteActionCompatParcelizerRemove.AudioAttributesCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer.run();
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class RemoteActionCompatParcelizer {
        final anyIgnorals AudioAttributesCompatParcelizer;
        private findAccess write;

        RemoteActionCompatParcelizer(anyIgnorals anyignorals, findAccess findaccess) {
            this.AudioAttributesCompatParcelizer = anyignorals;
            this.write = findaccess;
            anyignorals.IconCompatParcelizer(findaccess);
        }

        final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.write);
            this.write = null;
        }
    }
}
