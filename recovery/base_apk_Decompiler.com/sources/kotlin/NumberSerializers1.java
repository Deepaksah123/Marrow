package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.PropertySerializerMapEmpty;
import kotlin.StdKeySerializer;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NumberSerializers1 implements StdKeySerializers {
    private Looper looper;
    private modifyArraySerializer playerId;
    private PolymorphicTypeValidator timeline;
    private final ArrayList<StdKeySerializers.IconCompatParcelizer> mediaSourceCallers = new ArrayList<>(1);
    private final HashSet<StdKeySerializers.IconCompatParcelizer> enabledMediaSourceCallers = new HashSet<>(1);
    private final StdKeySerializer.read eventDispatcher = new StdKeySerializer.read();
    private final PropertySerializerMapEmpty.read drmEventDispatcher = new PropertySerializerMapEmpty.read();

    protected void disableInternal() {
    }

    protected void enableInternal() {
    }

    protected abstract void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver);

    protected abstract void releaseSourceInternal();

    protected final void refreshSourceInfo(PolymorphicTypeValidator polymorphicTypeValidator) {
        this.timeline = polymorphicTypeValidator;
        Iterator<StdKeySerializers.IconCompatParcelizer> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().IconCompatParcelizer(this, polymorphicTypeValidator);
        }
    }

    public final StdKeySerializer.read createEventDispatcher(StdKeySerializers.write writeVar) {
        return this.eventDispatcher.IconCompatParcelizer(0, writeVar);
    }

    protected final StdKeySerializer.read createEventDispatcher(int i, StdKeySerializers.write writeVar) {
        return this.eventDispatcher.IconCompatParcelizer(i, writeVar);
    }

    @Deprecated
    protected final StdKeySerializer.read createEventDispatcher(StdKeySerializers.write writeVar, long j) {
        return this.eventDispatcher.IconCompatParcelizer(0, writeVar);
    }

    @Deprecated
    protected final StdKeySerializer.read createEventDispatcher(int i, StdKeySerializers.write writeVar, long j) {
        return this.eventDispatcher.IconCompatParcelizer(i, writeVar);
    }

    protected final PropertySerializerMapEmpty.read createDrmEventDispatcher(StdKeySerializers.write writeVar) {
        return this.drmEventDispatcher.AudioAttributesCompatParcelizer(0, writeVar);
    }

    protected final PropertySerializerMapEmpty.read createDrmEventDispatcher(int i, StdKeySerializers.write writeVar) {
        return this.drmEventDispatcher.AudioAttributesCompatParcelizer(i, writeVar);
    }

    protected final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    protected final modifyArraySerializer getPlayerId() {
        return (modifyArraySerializer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.playerId);
    }

    protected final void setPlayerId(modifyArraySerializer modifyarrayserializer) {
        this.playerId = modifyarrayserializer;
    }

    protected final boolean prepareSourceCalled() {
        return !this.mediaSourceCallers.isEmpty();
    }

    @Override // kotlin.StdKeySerializers
    public final void addEventListener(Handler handler, StdKeySerializer stdKeySerializer) {
        this.eventDispatcher.RemoteActionCompatParcelizer(handler, stdKeySerializer);
    }

    @Override // kotlin.StdKeySerializers
    public final void removeEventListener(StdKeySerializer stdKeySerializer) {
        this.eventDispatcher.RemoteActionCompatParcelizer(stdKeySerializer);
    }

    @Override // kotlin.StdKeySerializers
    public final void addDrmEventListener(Handler handler, PropertySerializerMapEmpty propertySerializerMapEmpty) {
        this.drmEventDispatcher.read(handler, propertySerializerMapEmpty);
    }

    @Override // kotlin.StdKeySerializers
    public final void removeDrmEventListener(PropertySerializerMapEmpty propertySerializerMapEmpty) {
        this.drmEventDispatcher.IconCompatParcelizer(propertySerializerMapEmpty);
    }

    public final void prepareSource(StdKeySerializers.IconCompatParcelizer iconCompatParcelizer, TypeNameIdResolver typeNameIdResolver) {
        prepareSource(iconCompatParcelizer, typeNameIdResolver, modifyArraySerializer.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.StdKeySerializers
    public final void prepareSource(StdKeySerializers.IconCompatParcelizer iconCompatParcelizer, TypeNameIdResolver typeNameIdResolver, modifyArraySerializer modifyarrayserializer) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.looper;
        buildTypeSerializer.IconCompatParcelizer(looper == null || looper == looperMyLooper);
        this.playerId = modifyarrayserializer;
        PolymorphicTypeValidator polymorphicTypeValidator = this.timeline;
        this.mediaSourceCallers.add(iconCompatParcelizer);
        if (this.looper == null) {
            this.looper = looperMyLooper;
            this.enabledMediaSourceCallers.add(iconCompatParcelizer);
            prepareSourceInternal(typeNameIdResolver);
        } else if (polymorphicTypeValidator != null) {
            enable(iconCompatParcelizer);
            iconCompatParcelizer.IconCompatParcelizer(this, polymorphicTypeValidator);
        }
    }

    @Override // kotlin.StdKeySerializers
    public final void enable(StdKeySerializers.IconCompatParcelizer iconCompatParcelizer) {
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(iconCompatParcelizer);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    @Override // kotlin.StdKeySerializers
    public final void disable(StdKeySerializers.IconCompatParcelizer iconCompatParcelizer) {
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(iconCompatParcelizer);
        if (zIsEmpty || !this.enabledMediaSourceCallers.isEmpty()) {
            return;
        }
        disableInternal();
    }

    @Override // kotlin.StdKeySerializers
    public final void releaseSource(StdKeySerializers.IconCompatParcelizer iconCompatParcelizer) {
        this.mediaSourceCallers.remove(iconCompatParcelizer);
        if (this.mediaSourceCallers.isEmpty()) {
            this.looper = null;
            this.timeline = null;
            this.playerId = null;
            this.enabledMediaSourceCallers.clear();
            releaseSourceInternal();
            return;
        }
        disable(iconCompatParcelizer);
    }
}
