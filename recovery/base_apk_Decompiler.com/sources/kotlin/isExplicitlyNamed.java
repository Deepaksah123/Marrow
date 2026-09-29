package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class isExplicitlyNamed extends hasName<isExplicitlyIncluded, isExplicitlyIncluded> {
    @Override // kotlin.hasName
    final /* synthetic */ int AudioAttributesCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded) {
        return IconCompatParcelizer(isexplicitlyincluded);
    }

    @Override // kotlin.hasName
    final /* synthetic */ void AudioAttributesCompatParcelizer(Object obj, isExplicitlyIncluded isexplicitlyincluded) {
        RemoteActionCompatParcelizer(obj, isexplicitlyincluded);
    }

    @Override // kotlin.hasName
    final /* synthetic */ isExplicitlyIncluded AudioAttributesImplBaseParcelizer(isExplicitlyIncluded isexplicitlyincluded) {
        return read2(isexplicitlyincluded);
    }

    @Override // kotlin.hasName
    final /* synthetic */ isExplicitlyIncluded IconCompatParcelizer(Object obj) {
        return MediaBrowserCompatItemReceiver(obj);
    }

    @Override // kotlin.hasName
    final /* synthetic */ void IconCompatParcelizer(Object obj, isExplicitlyIncluded isexplicitlyincluded) {
        write(obj, isexplicitlyincluded);
    }

    @Override // kotlin.hasName
    final /* synthetic */ isExplicitlyIncluded RemoteActionCompatParcelizer() {
        return write();
    }

    @Override // kotlin.hasName
    final /* synthetic */ isExplicitlyIncluded RemoteActionCompatParcelizer(Object obj) {
        return AudioAttributesImplApi26Parcelizer(obj);
    }

    @Override // kotlin.hasName
    final /* synthetic */ isExplicitlyIncluded RemoteActionCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded, isExplicitlyIncluded isexplicitlyincluded2) {
        return IconCompatParcelizer(isexplicitlyincluded, isexplicitlyincluded2);
    }

    @Override // kotlin.hasName
    final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded, int i, long j) {
        RemoteActionCompatParcelizer2(isexplicitlyincluded, i, j);
    }

    @Override // kotlin.hasName
    final /* synthetic */ void RemoteActionCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded, int i, isExplicitlyIncluded isexplicitlyincluded2) {
        write(isexplicitlyincluded, i, isexplicitlyincluded2);
    }

    @Override // kotlin.hasName
    final /* synthetic */ int read(isExplicitlyIncluded isexplicitlyincluded) {
        return write(isexplicitlyincluded);
    }

    @Override // kotlin.hasName
    final /* synthetic */ void read(isExplicitlyIncluded isexplicitlyincluded, int i, long j) {
        AudioAttributesCompatParcelizer(isexplicitlyincluded, i, j);
    }

    @Override // kotlin.hasName
    final /* bridge */ /* synthetic */ void read(isExplicitlyIncluded isexplicitlyincluded, int i, AnnotatedWithParams annotatedWithParams) {
        read2(isexplicitlyincluded, i, annotatedWithParams);
    }

    @Override // kotlin.hasName
    final /* bridge */ /* synthetic */ void read(isExplicitlyIncluded isexplicitlyincluded, CollectorBase collectorBase) throws IOException {
        read2(isexplicitlyincluded, collectorBase);
    }

    @Override // kotlin.hasName
    final /* synthetic */ void write(isExplicitlyIncluded isexplicitlyincluded, int i, int i2) {
        IconCompatParcelizer(isexplicitlyincluded, i, i2);
    }

    @Override // kotlin.hasName
    final /* synthetic */ void write(isExplicitlyIncluded isexplicitlyincluded, CollectorBase collectorBase) throws IOException {
        RemoteActionCompatParcelizer(isexplicitlyincluded, collectorBase);
    }

    isExplicitlyNamed() {
    }

    private static isExplicitlyIncluded write() {
        return isExplicitlyIncluded.write();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
    private static void RemoteActionCompatParcelizer2(isExplicitlyIncluded isexplicitlyincluded, int i, long j) {
        isexplicitlyincluded.read(_ignorableAnnotation.RemoteActionCompatParcelizer(i, 0), Long.valueOf(j));
    }

    private static void IconCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded, int i, int i2) {
        isexplicitlyincluded.read(_ignorableAnnotation.RemoteActionCompatParcelizer(i, 5), Integer.valueOf(i2));
    }

    private static void AudioAttributesCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded, int i, long j) {
        isexplicitlyincluded.read(_ignorableAnnotation.RemoteActionCompatParcelizer(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    private static void read2(isExplicitlyIncluded isexplicitlyincluded, int i, AnnotatedWithParams annotatedWithParams) {
        isexplicitlyincluded.read(_ignorableAnnotation.RemoteActionCompatParcelizer(i, 2), annotatedWithParams);
    }

    private static void write(isExplicitlyIncluded isexplicitlyincluded, int i, isExplicitlyIncluded isexplicitlyincluded2) {
        isexplicitlyincluded.read(_ignorableAnnotation.RemoteActionCompatParcelizer(i, 3), isexplicitlyincluded2);
    }

    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    private static isExplicitlyIncluded read2(isExplicitlyIncluded isexplicitlyincluded) {
        isexplicitlyincluded.AudioAttributesCompatParcelizer();
        return isexplicitlyincluded;
    }

    private static void write(Object obj, isExplicitlyIncluded isexplicitlyincluded) {
        ((_explicitClassOrOb) obj).unknownFields = isexplicitlyincluded;
    }

    private static isExplicitlyIncluded AudioAttributesImplApi26Parcelizer(Object obj) {
        return ((_explicitClassOrOb) obj).unknownFields;
    }

    private static isExplicitlyIncluded MediaBrowserCompatItemReceiver(Object obj) {
        isExplicitlyIncluded isexplicitlyincludedAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(obj);
        if (isexplicitlyincludedAudioAttributesImplApi26Parcelizer != isExplicitlyIncluded.IconCompatParcelizer()) {
            return isexplicitlyincludedAudioAttributesImplApi26Parcelizer;
        }
        isExplicitlyIncluded isexplicitlyincludedWrite = isExplicitlyIncluded.write();
        write(obj, isexplicitlyincludedWrite);
        return isexplicitlyincludedWrite;
    }

    private static void RemoteActionCompatParcelizer(Object obj, isExplicitlyIncluded isexplicitlyincluded) {
        write(obj, isexplicitlyincluded);
    }

    @Override // kotlin.hasName
    final void write(Object obj) {
        AudioAttributesImplApi26Parcelizer(obj).AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    private static void read2(isExplicitlyIncluded isexplicitlyincluded, CollectorBase collectorBase) throws IOException {
        isexplicitlyincluded.AudioAttributesCompatParcelizer(collectorBase);
    }

    private static void RemoteActionCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded, CollectorBase collectorBase) throws IOException {
        isexplicitlyincluded.read(collectorBase);
    }

    private static isExplicitlyIncluded IconCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded, isExplicitlyIncluded isexplicitlyincluded2) {
        return isexplicitlyincluded2.equals(isExplicitlyIncluded.IconCompatParcelizer()) ? isexplicitlyincluded : isExplicitlyIncluded.IconCompatParcelizer(isexplicitlyincluded, isexplicitlyincluded2);
    }

    private static int write(isExplicitlyIncluded isexplicitlyincluded) {
        return isexplicitlyincluded.RemoteActionCompatParcelizer();
    }

    private static int IconCompatParcelizer(isExplicitlyIncluded isexplicitlyincluded) {
        return isexplicitlyincluded.read();
    }
}
