package kotlin;

import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassStack extends NumberSerializersIntegerSerializer<Void> {
    protected final StdKeySerializers AudioAttributesCompatParcelizer;

    private static int IconCompatParcelizer(int i) {
        return i;
    }

    private static long RemoteActionCompatParcelizer(long j) {
        return j;
    }

    protected StdKeySerializers.write AudioAttributesCompatParcelizer(StdKeySerializers.write writeVar) {
        return writeVar;
    }

    @Override // kotlin.NumberSerializersIntegerSerializer
    protected final /* synthetic */ long AudioAttributesCompatParcelizer(Void r1, long j, StdKeySerializers.write writeVar) {
        return write(j);
    }

    @Override // kotlin.NumberSerializersIntegerSerializer
    protected final /* bridge */ /* synthetic */ StdKeySerializers.write IconCompatParcelizer(Void r1, StdKeySerializers.write writeVar) {
        return IconCompatParcelizer(writeVar);
    }

    @Override // kotlin.NumberSerializersIntegerSerializer
    protected final /* synthetic */ int read(Void r1, int i) {
        return AudioAttributesCompatParcelizer(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.NumberSerializersIntegerSerializer
    /* JADX INFO: renamed from: read */
    public final /* synthetic */ void RemoteActionCompatParcelizer(Void r1, StdKeySerializers stdKeySerializers, PolymorphicTypeValidator polymorphicTypeValidator) {
        write(polymorphicTypeValidator);
    }

    protected ClassStack(StdKeySerializers stdKeySerializers) {
        this.AudioAttributesCompatParcelizer = stdKeySerializers;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.NumberSerializersIntegerSerializer, kotlin.NumberSerializers1
    public final void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver) {
        super.prepareSourceInternal(typeNameIdResolver);
        write();
    }

    protected void write() {
        IconCompatParcelizer();
    }

    @Override // kotlin.StdKeySerializers
    public final PolymorphicTypeValidator read() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    @Override // kotlin.StdKeySerializers
    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.StdKeySerializers
    public JsonSerializableSchema getMediaItem() {
        return this.AudioAttributesCompatParcelizer.getMediaItem();
    }

    @Override // kotlin.StdKeySerializers
    public boolean canUpdateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        return this.AudioAttributesCompatParcelizer.canUpdateMediaItem(jsonSerializableSchema);
    }

    @Override // kotlin.StdKeySerializers
    public void updateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        this.AudioAttributesCompatParcelizer.updateMediaItem(jsonSerializableSchema);
    }

    @Override // kotlin.StdKeySerializers
    public StdJdkSerializersAtomicIntegerSerializer createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        return this.AudioAttributesCompatParcelizer.createPeriod(writeVar, _findwellknownsimple, j);
    }

    @Override // kotlin.StdKeySerializers
    public void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        this.AudioAttributesCompatParcelizer.releasePeriod(stdJdkSerializersAtomicIntegerSerializer);
    }

    private void write(PolymorphicTypeValidator polymorphicTypeValidator) {
        read(polymorphicTypeValidator);
    }

    protected void read(PolymorphicTypeValidator polymorphicTypeValidator) {
        refreshSourceInfo(polymorphicTypeValidator);
    }

    private static int AudioAttributesCompatParcelizer(int i) {
        return IconCompatParcelizer(i);
    }

    private StdKeySerializers.write IconCompatParcelizer(StdKeySerializers.write writeVar) {
        return AudioAttributesCompatParcelizer(writeVar);
    }

    private static long write(long j) {
        return RemoteActionCompatParcelizer(j);
    }

    protected final void IconCompatParcelizer() {
        RemoteActionCompatParcelizer(null, this.AudioAttributesCompatParcelizer);
    }
}
