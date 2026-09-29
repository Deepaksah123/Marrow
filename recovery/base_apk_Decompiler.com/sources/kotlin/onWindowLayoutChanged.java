package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin.WorkDatabase;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020\r*\u00020)H\u0016¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020/*\u00020,2\u0006\u0010\u0006\u001a\u00020-2\u0006\u0010\b\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00100\u001a\u00020\u0013*\u0002022\u0006\u0010\u0006\u001a\u0002032\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u00104J#\u0010'\u001a\u00020\u0013*\u0002022\u0006\u0010\u0006\u001a\u0002032\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u00104J#\u00105\u001a\u00020\u0013*\u0002022\u0006\u0010\u0006\u001a\u0002032\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b5\u00104J#\u0010*\u001a\u00020\u0013*\u0002022\u0006\u0010\u0006\u001a\u0002032\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u00104J\u00ad\u0001\u0010'\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000f2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b'\u00106R\u0018\u00105\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00109R\u0014\u00100\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010*\u001a\u00020<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010="}, d2 = {"Lo/onWindowLayoutChanged;", "Lo/addAbstractTypeResolver;", "Lo/_initForReading;", "Lo/addKeySerializers;", "Lo/insertAnnotationIntrospector;", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/_reportMissingSetter$write;", "p2", "Lkotlin/Function1;", "Lo/deserializeFromNumber;", "", "p3", "Lo/paramName;", "p4", "", "p5", "", "p6", "p7", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p8", "Lo/WritableTypeIdInclusion;", "p9", "Lo/JFunction2;", "p10", "Lo/MinimalPrettyPrinter;", "p11", "Lo/setTrackNameProvider;", "p12", "Lo/WorkDatabase$RemoteActionCompatParcelizer;", "p13", "<init>", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;Lo/getAnswerMap;IZIILjava/util/List;Lo/getAnswerMap;Lo/JFunction2;Lo/MinimalPrettyPrinter;Lo/setTrackNameProvider;Lo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/isAbstract;", "AudioAttributesCompatParcelizer", "(Lo/isAbstract;)V", "Lo/findSerializer;", "write", "(Lo/findSerializer;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "RemoteActionCompatParcelizer", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Ljava/util/List;IIZLo/_reportMissingSetter$write;ILo/getAnswerMap;Lo/getAnswerMap;Lo/JFunction2;Lo/MinimalPrettyPrinter;Lo/setTrackNameProvider;)V", "IconCompatParcelizer", "Lo/JFunction2;", "Lo/getAnswerMap;", "AudioAttributesImplBaseParcelizer", "()Z", "Lo/WorkDatabase;", "Lo/WorkDatabase;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onWindowLayoutChanged extends addAbstractTypeResolver implements _initForReading, addKeySerializers, insertAnnotationIntrospector {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private JFunction2 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super WorkDatabase.RemoteActionCompatParcelizer, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final WorkDatabase write;

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final boolean getRemoteActionCompatParcelizer() {
        return false;
    }

    private onWindowLayoutChanged(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap<? super deserializeFromNumber, getShowPopup> getanswermap, int i, boolean z, int i2, int i3, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, getAnswerMap<? super WorkDatabase.RemoteActionCompatParcelizer, getShowPopup> getanswermap3) {
        this.RemoteActionCompatParcelizer = jFunction2;
        this.IconCompatParcelizer = getanswermap3;
        this.write = (WorkDatabase) AudioAttributesCompatParcelizer(new WorkDatabase(abstractDeserializer, deserializewithobjectid, writeVar, getanswermap, i, z, i2, i3, list, getanswermap2, jFunction2, minimalPrettyPrinter, settracknameprovider, getanswermap3, null));
        if (this.RemoteActionCompatParcelizer != null) {
            return;
        }
        getRootStableInsets.read("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new PlanDetailsCreator();
    }

    public /* synthetic */ onWindowLayoutChanged(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap getanswermap, int i, boolean z, int i2, int i3, List list, getAnswerMap getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, getAnswerMap getanswermap3, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, writeVar, (i4 & 8) != 0 ? null : getanswermap, (i4 & 16) != 0 ? paramName.INSTANCE.RemoteActionCompatParcelizer() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : getanswermap2, (i4 & 1024) != 0 ? null : jFunction2, (i4 & 2048) != 0 ? null : minimalPrettyPrinter, (i4 & 4096) != 0 ? null : settracknameprovider, (i4 & 8192) != 0 ? null : getanswermap3, null);
    }

    @Override // kotlin.insertAnnotationIntrospector
    public final void AudioAttributesCompatParcelizer(isAbstract p0) {
        JFunction2 jFunction2 = this.RemoteActionCompatParcelizer;
        if (jFunction2 != null) {
            jFunction2.RemoteActionCompatParcelizer(p0);
        }
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        this.write.RemoteActionCompatParcelizer(findserializer);
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        return this.write.AudioAttributesCompatParcelizer(withcontentvaluehandler, istypeorsupertypeof, j);
    }

    @Override // kotlin._initForReading
    public final int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return this.write.MediaBrowserCompatCustomActionResultReceiver(getvaluehandler, hashandlers, i);
    }

    @Override // kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return this.write.MediaBrowserCompatItemReceiver(getvaluehandler, hashandlers, i);
    }

    @Override // kotlin._initForReading
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return this.write.AudioAttributesImplApi21Parcelizer(getvaluehandler, hashandlers, i);
    }

    @Override // kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return this.write.IconCompatParcelizer(getvaluehandler, hashandlers, i);
    }

    public final void AudioAttributesCompatParcelizer(AbstractDeserializer p0, deserializeWithObjectId p1, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> p2, int p3, int p4, boolean p5, _reportMissingSetter.write p6, int p7, getAnswerMap<? super deserializeFromNumber, getShowPopup> p8, getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> p9, JFunction2 p10, MinimalPrettyPrinter p11, setTrackNameProvider p12) {
        WorkDatabase workDatabase = this.write;
        workDatabase.RemoteActionCompatParcelizer(workDatabase.write(p11, p1), this.write.IconCompatParcelizer(p0), this.write.AudioAttributesCompatParcelizer(p1, p2, p3, p4, p5, p6, p7, p12), this.write.read(p8, p9, p10, this.IconCompatParcelizer));
        this.RemoteActionCompatParcelizer = p10;
        _newReader.RemoteActionCompatParcelizer(this);
    }

    public /* synthetic */ onWindowLayoutChanged(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap getanswermap, int i, boolean z, int i2, int i3, List list, getAnswerMap getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, getAnswerMap getanswermap3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, writeVar, getanswermap, i, z, i2, i3, list, getanswermap2, jFunction2, minimalPrettyPrinter, settracknameprovider, getanswermap3);
    }
}
