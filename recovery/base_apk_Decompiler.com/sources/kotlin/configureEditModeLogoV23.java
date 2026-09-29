package kotlin;

import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin._reportMissingSetter;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u0018\u001a\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a"}, d2 = {"", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/_reportMissingSetter$write;", "p2", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;Lo/_handleUnrecognizedCharacterEscape;I)V", "Lo/AbstractDeserializer;", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p3", "RemoteActionCompatParcelizer", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;Ljava/util/List;Lo/_handleUnrecognizedCharacterEscape;I)V", "", "", "IconCompatParcelizer", "(I)Z", "Lo/CharacterEscapes;", "Ljava/util/concurrent/Executor;", "read", "Lo/CharacterEscapes;", "write", "Ljava/lang/Boolean;", "()Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class configureEditModeLogoV23 {
    private static final CharacterEscapes<Executor> read = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.applyTextureViewRotation
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return configureEditModeLogoV23.RemoteActionCompatParcelizer();
        }
    });
    private static Boolean write;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor RemoteActionCompatParcelizer() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: RejectedExecutionException -> 0x00ad, TryCatch #0 {RejectedExecutionException -> 0x00ad, blocks: (B:11:0x004f, B:17:0x005c, B:19:0x006e, B:25:0x007a, B:27:0x008c, B:30:0x00a1, B:29:0x0094, B:21:0x0074, B:13:0x0055), top: B:38:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final java.lang.String r9, final kotlin.deserializeWithObjectId r10, final o._reportMissingSetter.write r11, kotlin._handleUnrecognizedCharacterEscape r12, int r13) {
        /*
            boolean r0 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)"
            r2 = 1589371739(0x5ebbe35b, float:6.7693825E18)
            kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r2, r13, r0, r1)
        Lf:
            o.CharacterEscapes<java.util.concurrent.Executor> r0 = kotlin.configureEditModeLogoV23.read
            o.getTokenColumnNr r0 = (kotlin.getTokenColumnNr) r0
            java.lang.Object r0 = r12.write(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto La7
            int r1 = r9.length()
            boolean r1 = IconCompatParcelizer(r1)
            if (r1 == 0) goto La7
            r1 = 1254274527(0x4ac2b5df, float:6380271.5)
            r12.IconCompatParcelizer(r1)
            o.CharacterEscapes r1 = kotlin.getDefaultNullValueSerializer.RatingCompat()
            o.getTokenColumnNr r1 = (kotlin.getTokenColumnNr) r1
            java.lang.Object r1 = r12.write(r1)
            r4 = r1
            o.tryToResolveUnresolved r4 = (kotlin.tryToResolveUnresolved) r4
            o.CharacterEscapes r1 = kotlin.getDefaultNullValueSerializer.IconCompatParcelizer()
            o.getTokenColumnNr r1 = (kotlin.getTokenColumnNr) r1
            java.lang.Object r1 = r12.write(r1)
            r6 = r1
            o.bufferMapProperty r6 = (kotlin.bufferMapProperty) r6
            r1 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 1
            r3 = 32
            r5 = 0
            if (r1 <= r3) goto L55
            boolean r1 = r12.AudioAttributesCompatParcelizer(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            if (r1 != 0) goto L59
        L55:
            r1 = r13 & 48
            if (r1 != r3) goto L5b
        L59:
            r1 = r2
            goto L5c
        L5b:
            r1 = r5
        L5c:
            r3 = r4
            java.lang.Enum r3 = (java.lang.Enum) r3     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            int r3 = r3.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            boolean r3 = r12.RemoteActionCompatParcelizer(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            r7 = r13 & 14
            r7 = r7 ^ 6
            r8 = 4
            if (r7 <= r8) goto L74
            boolean r7 = r12.AudioAttributesCompatParcelizer(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            if (r7 != 0) goto L7a
        L74:
            r13 = r13 & 6
            if (r13 != r8) goto L79
            goto L7a
        L79:
            r2 = r5
        L7a:
            boolean r13 = r12.AudioAttributesCompatParcelizer(r6)     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            boolean r5 = r12.IconCompatParcelizer(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            java.lang.Object r7 = r12.onPause()     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            r1 = r1 | r3
            r1 = r1 | r2
            r13 = r13 | r1
            r13 = r13 | r5
            if (r13 != 0) goto L94
            o._handleUnrecognizedCharacterEscape$write r13 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            java.lang.Object r13 = r13.IconCompatParcelizer()     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            if (r7 != r13) goto La1
        L94:
            o.closeShutter r13 = new o.closeShutter     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            r2 = r13
            r3 = r10
            r5 = r9
            r7 = r11
            r2.<init>()     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            r12.RemoteActionCompatParcelizer(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            r7 = r13
        La1:
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            r0.execute(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> Lad
            goto Lad
        La7:
            r9 = 1250991751(0x4a909e87, float:4738883.5)
            r12.IconCompatParcelizer(r9)
        Lad:
            r12.MediaBrowserCompatCustomActionResultReceiver()
            boolean r9 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r9 == 0) goto Lb9
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.configureEditModeLogoV23.AudioAttributesCompatParcelizer(java.lang.String, o.deserializeWithObjectId, o._reportMissingSetter$write, o._handleUnrecognizedCharacterEscape, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: RejectedExecutionException -> 0x00b3, TryCatch #0 {RejectedExecutionException -> 0x00b3, blocks: (B:11:0x004f, B:17:0x005c, B:19:0x0072, B:25:0x007e, B:27:0x0091, B:30:0x00a7, B:29:0x0099, B:21:0x0078, B:13:0x0055), top: B:38:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final kotlin.AbstractDeserializer r10, final kotlin.deserializeWithObjectId r11, final o._reportMissingSetter.write r12, final java.util.List<o.AbstractDeserializer.AudioAttributesCompatParcelizer<kotlin._findCustomMapDeserializer>> r13, kotlin._handleUnrecognizedCharacterEscape r14, int r15) {
        /*
            boolean r0 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:102)"
            r2 = -650368117(0xffffffffd93c2b8b, float:-3.3103232E15)
            kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r2, r15, r0, r1)
        Lf:
            o.CharacterEscapes<java.util.concurrent.Executor> r0 = kotlin.configureEditModeLogoV23.read
            o.getTokenColumnNr r0 = (kotlin.getTokenColumnNr) r0
            java.lang.Object r0 = r14.write(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto Lad
            int r1 = r10.length()
            boolean r1 = IconCompatParcelizer(r1)
            if (r1 == 0) goto Lad
            r1 = -518761746(0xffffffffe11452ee, float:-1.7100586E20)
            r14.IconCompatParcelizer(r1)
            o.CharacterEscapes r1 = kotlin.getDefaultNullValueSerializer.RatingCompat()
            o.getTokenColumnNr r1 = (kotlin.getTokenColumnNr) r1
            java.lang.Object r1 = r14.write(r1)
            r4 = r1
            o.tryToResolveUnresolved r4 = (kotlin.tryToResolveUnresolved) r4
            o.CharacterEscapes r1 = kotlin.getDefaultNullValueSerializer.IconCompatParcelizer()
            o.getTokenColumnNr r1 = (kotlin.getTokenColumnNr) r1
            java.lang.Object r1 = r14.write(r1)
            r7 = r1
            o.bufferMapProperty r7 = (kotlin.bufferMapProperty) r7
            r1 = r15 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 1
            r3 = 32
            r5 = 0
            if (r1 <= r3) goto L55
            boolean r1 = r14.AudioAttributesCompatParcelizer(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            if (r1 != 0) goto L59
        L55:
            r1 = r15 & 48
            if (r1 != r3) goto L5b
        L59:
            r1 = r2
            goto L5c
        L5b:
            r1 = r5
        L5c:
            r3 = r4
            java.lang.Enum r3 = (java.lang.Enum) r3     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            int r3 = r3.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            boolean r3 = r14.RemoteActionCompatParcelizer(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            boolean r6 = r14.IconCompatParcelizer(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            r8 = r15 & 14
            r8 = r8 ^ 6
            r9 = 4
            if (r8 <= r9) goto L78
            boolean r8 = r14.AudioAttributesCompatParcelizer(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            if (r8 != 0) goto L7e
        L78:
            r15 = r15 & 6
            if (r15 != r9) goto L7d
            goto L7e
        L7d:
            r2 = r5
        L7e:
            boolean r15 = r14.AudioAttributesCompatParcelizer(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            boolean r5 = r14.IconCompatParcelizer(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            java.lang.Object r8 = r14.onPause()     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            r1 = r1 | r3
            r1 = r1 | r6
            r1 = r1 | r2
            r15 = r15 | r1
            r15 = r15 | r5
            if (r15 != 0) goto L99
            o._handleUnrecognizedCharacterEscape$write r15 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            java.lang.Object r15 = r15.IconCompatParcelizer()     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            if (r8 != r15) goto La7
        L99:
            o.configureEditModeLogo r15 = new o.configureEditModeLogo     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            r2 = r15
            r3 = r11
            r5 = r13
            r6 = r10
            r8 = r12
            r2.<init>()     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            r14.RemoteActionCompatParcelizer(r15)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            r8 = r15
        La7:
            java.lang.Runnable r8 = (java.lang.Runnable) r8     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            r0.execute(r8)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb3
            goto Lb3
        Lad:
            r10 = -523310345(0xffffffffe0ceeaf7, float:-1.1928001E20)
            r14.IconCompatParcelizer(r10)
        Lb3:
            r14.MediaBrowserCompatCustomActionResultReceiver()
            boolean r10 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r10 == 0) goto Lbf
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.configureEditModeLogoV23.RemoteActionCompatParcelizer(o.AbstractDeserializer, o.deserializeWithObjectId, o._reportMissingSetter$write, java.util.List, o._handleUnrecognizedCharacterEscape, int):void");
    }

    public static final boolean read() {
        if (write == null) {
            write = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
        }
        Boolean bool = write;
        toMagicModuleMetaRepoModel.write(bool);
        return bool.booleanValue();
    }

    public static final boolean IconCompatParcelizer(int i) {
        return i >= 8 && i < 1000 && read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public static final void write(deserializeWithObjectId deserializewithobjectid, tryToResolveUnresolved trytoresolveunresolved, String str, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            ParseDigitsTaskCharSequence parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer$default = parseDigitsRecursive.Companion.AudioAttributesCompatParcelizer$default(parseDigitsRecursive.INSTANCE, null, null, 3, null);
            try {
                ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer$default;
                parseDigitsRecursive parsedigitsrecursiveOnPause = parseDigitsTaskCharSequence.onPause();
                try {
                    _findCustomCollectionDeserializer.RemoteActionCompatParcelizer$default(str, injectValues.IconCompatParcelizer(deserializewithobjectid, trytoresolveunresolved), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), buffermapproperty, writeVar, null, 32, null).write();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer$default.IconCompatParcelizer().RemoteActionCompatParcelizer();
                    parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer$default.write();
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                } finally {
                    parseDigitsTaskCharSequence.AudioAttributesImplApi26Parcelizer(parsedigitsrecursiveOnPause);
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public static final void IconCompatParcelizer(deserializeWithObjectId deserializewithobjectid, tryToResolveUnresolved trytoresolveunresolved, List list, AbstractDeserializer abstractDeserializer, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            ParseDigitsTaskCharSequence parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer$default = parseDigitsRecursive.Companion.AudioAttributesCompatParcelizer$default(parseDigitsRecursive.INSTANCE, null, null, 3, null);
            try {
                ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer$default;
                parseDigitsRecursive parsedigitsrecursiveOnPause = parseDigitsTaskCharSequence.onPause();
                try {
                    deserializeWithObjectId deserializewithobjectidIconCompatParcelizer = injectValues.IconCompatParcelizer(deserializewithobjectid, trytoresolveunresolved);
                    if (list == null) {
                        list = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    }
                    new _findParamName(abstractDeserializer, deserializewithobjectidIconCompatParcelizer, list, buffermapproperty, writeVar).write();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer$default.IconCompatParcelizer().RemoteActionCompatParcelizer();
                    parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer$default.write();
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                } finally {
                    parseDigitsTaskCharSequence.AudioAttributesImplApi26Parcelizer(parsedigitsrecursiveOnPause);
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }
}
