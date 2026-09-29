package kotlin;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin.find;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0007\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0019\u001a'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u001b\u001aa\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u000b2&\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001dH\u0000¢\u0006\u0004\b\u0017\u0010#\u001a3\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010%\u001aY\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e2&\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001dH\u0002¢\u0006\u0004\b\f\u0010&\u001aM\u0010\u0014\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010$2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000f0\u000e2\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060'H\u0000¢\u0006\u0004\b\u0014\u0010(\u001a!\u0010\u0007\u001a\u0004\u0018\u00010)2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0007\u0010*\u001a-\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010+2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010,\u001a-\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010-2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010.\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u00100\u001a-\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u0001012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u00102\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u0001032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u00104\u001a-\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u0001052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u00106\u001a3\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u00107\u001a-\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u0001082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0014\u00109\u001a+\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u00100\u001a-\u0010;\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010:2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010<\u001a5\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010=2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010>\u001a\u0013\u0010;\u001a\u00020\u001a*\u00020\u001cH\u0002¢\u0006\u0004\b;\u0010?\u001a\u001d\u0010\u0007\u001a\u00020$*\u0004\u0018\u00010$2\u0006\u0010\u0002\u001a\u00020$H\u0002¢\u0006\u0004\b\u0007\u0010@\"\u0018\u0010\f\u001a\u00020\u001a*\u00020$8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010A"}, d2 = {"Landroid/text/Spannable;", "", "p0", "", "p1", "p2", "", "IconCompatParcelizer", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Lo/withProperty;", "", "Lo/bufferMapProperty;", "AudioAttributesCompatParcelizer", "(Landroid/text/Spannable;Lo/withProperty;FLo/bufferMapProperty;)V", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "p3", "(Landroid/text/Spannable;Ljava/util/List;FLo/bufferMapProperty;Lo/withProperty;)V", "Lo/ReadableObjectIdReferring;", "RemoteActionCompatParcelizer", "(JFLo/bufferMapProperty;)F", "Lo/find;", "read", "(Landroid/text/Spannable;JFLo/bufferMapProperty;Lo/find;)V", "(Landroid/text/Spannable;JFLo/bufferMapProperty;)V", "", "(Lo/bufferMapProperty;)Z", "Lo/deserializeWithObjectId;", "Lkotlin/Function4;", "Lo/_reportMissingSetter;", "Lo/getDataStream;", "Lo/withValueDeserializer;", "Lo/_findFormat;", "Landroid/graphics/Typeface;", "(Landroid/text/Spannable;Lo/deserializeWithObjectId;Ljava/util/List;Lo/bufferMapProperty;Lo/getMagicModuleStat;)V", "Lo/_findPropertyUnwrapper;", "(Landroid/text/Spannable;Lo/_findPropertyUnwrapper;IILo/bufferMapProperty;)V", "(Landroid/text/Spannable;Lo/deserializeWithObjectId;Ljava/util/List;Lo/getMagicModuleStat;)V", "Lkotlin/Function3;", "(Lo/_findPropertyUnwrapper;Ljava/util/List;Lo/getModuleData;)V", "Landroid/text/style/MetricAffectingSpan;", "(JLo/bufferMapProperty;)Landroid/text/style/MetricAffectingSpan;", "Lo/nopInstance;", "(Landroid/text/Spannable;Lo/nopInstance;II)V", "Lo/findViews;", "(Landroid/text/Spannable;Lo/findViews;II)V", "Lo/switchToNext;", "(Landroid/text/Spannable;JII)V", "Lo/canCreateFromBoolean;", "(Landroid/text/Spannable;Lo/canCreateFromBoolean;II)V", "Lo/CreatorCandidate;", "(Landroid/text/Spannable;Lo/CreatorCandidate;II)V", "", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "(Landroid/text/Spannable;JLo/bufferMapProperty;II)V", "Lo/renameAll;", "(Landroid/text/Spannable;Lo/renameAll;II)V", "Lo/_find2ViaAlias;", "write", "(Landroid/text/Spannable;Lo/_find2ViaAlias;II)V", "Lo/Instantiatable;", "(Landroid/text/Spannable;Lo/Instantiatable;FII)V", "(Lo/deserializeWithObjectId;)Z", "(Lo/_findPropertyUnwrapper;Lo/_findPropertyUnwrapper;)Lo/_findPropertyUnwrapper;", "(Lo/_findPropertyUnwrapper;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getValueClass {
    public static final void IconCompatParcelizer(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final void AudioAttributesCompatParcelizer(Spannable spannable, withProperty withproperty, float f, bufferMapProperty buffermapproperty) {
        float fAudioAttributesCompatParcelizer;
        if (withproperty != null) {
            if ((ReadableObjectIdReferring.AudioAttributesCompatParcelizer(withproperty.getIconCompatParcelizer(), setResolver.RemoteActionCompatParcelizer(0)) && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(withproperty.getRead(), setResolver.RemoteActionCompatParcelizer(0))) || ReadableObjectIdReferring.RemoteActionCompatParcelizer(withproperty.getIconCompatParcelizer()) == 0 || ReadableObjectIdReferring.RemoteActionCompatParcelizer(withproperty.getRead()) == 0) {
                return;
            }
            long jWrite = ReadableObjectIdReferring.write(withproperty.getIconCompatParcelizer());
            boolean z = processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.read());
            float fAudioAttributesCompatParcelizer2 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                fAudioAttributesCompatParcelizer = buffermapproperty.c_(withproperty.getIconCompatParcelizer());
            } else {
                fAudioAttributesCompatParcelizer = processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer()) ? ReadableObjectIdReferring.AudioAttributesCompatParcelizer(withproperty.getIconCompatParcelizer()) * f : 0.0f;
            }
            long jWrite2 = ReadableObjectIdReferring.write(withproperty.getRead());
            if (processUnwrapped.read(jWrite2, processUnwrapped.INSTANCE.read())) {
                fAudioAttributesCompatParcelizer2 = buffermapproperty.c_(withproperty.getRead());
            } else if (processUnwrapped.read(jWrite2, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
                fAudioAttributesCompatParcelizer2 = ReadableObjectIdReferring.AudioAttributesCompatParcelizer(withproperty.getRead()) * f;
            }
            IconCompatParcelizer(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fAudioAttributesCompatParcelizer), (int) Math.ceil(fAudioAttributesCompatParcelizer2)), 0, spannable.length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconCompatParcelizer(android.text.Spannable r17, java.util.List<? extends o.AbstractDeserializer.AudioAttributesCompatParcelizer<? extends o.AbstractDeserializer.RemoteActionCompatParcelizer>> r18, float r19, kotlin.bufferMapProperty r20, kotlin.withProperty r21) {
        /*
            r0 = r18
            r1 = r19
            r12 = r20
            r2 = 0
            if (r21 == 0) goto L3b
            long r3 = r21.getIconCompatParcelizer()
            long r3 = kotlin.ReadableObjectIdReferring.write(r3)
            o.processUnwrapped$read r5 = kotlin.processUnwrapped.INSTANCE
            long r5 = r5.read()
            boolean r5 = kotlin.processUnwrapped.read(r3, r5)
            if (r5 == 0) goto L26
            long r2 = r21.getIconCompatParcelizer()
            float r2 = r12.c_(r2)
            goto L3b
        L26:
            o.processUnwrapped$read r5 = kotlin.processUnwrapped.INSTANCE
            long r5 = r5.AudioAttributesCompatParcelizer()
            boolean r3 = kotlin.processUnwrapped.read(r3, r5)
            if (r3 == 0) goto L3b
            long r2 = r21.getIconCompatParcelizer()
            float r2 = kotlin.ReadableObjectIdReferring.AudioAttributesCompatParcelizer(r2)
            float r2 = r2 * r1
        L3b:
            r13 = r2
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            int r14 = r2.size()
            r2 = 0
            r15 = r2
        L45:
            if (r15 >= r14) goto Lb6
            java.lang.Object r2 = r0.get(r15)
            r16 = r2
            o.AbstractDeserializer$AudioAttributesCompatParcelizer r16 = (o.AbstractDeserializer.AudioAttributesCompatParcelizer) r16
            java.lang.Object r2 = r16.IconCompatParcelizer()
            boolean r3 = r2 instanceof kotlin.withAdditionalSerializers
            if (r3 == 0) goto L5a
            o.withAdditionalSerializers r2 = (kotlin.withAdditionalSerializers) r2
            goto L5b
        L5a:
            r2 = 0
        L5b:
            if (r2 == 0) goto Laf
            long r3 = r2.getRead()
            float r4 = RemoteActionCompatParcelizer(r3, r1, r12)
            long r5 = r2.getRemoteActionCompatParcelizer()
            float r5 = RemoteActionCompatParcelizer(r5, r1, r12)
            long r6 = r2.getAudioAttributesCompatParcelizer()
            float r6 = RemoteActionCompatParcelizer(r6, r1, r12)
            boolean r3 = java.lang.Float.isNaN(r4)
            if (r3 != 0) goto Laf
            boolean r3 = java.lang.Float.isNaN(r5)
            if (r3 != 0) goto Laf
            boolean r3 = java.lang.Float.isNaN(r6)
            if (r3 != 0) goto Laf
            o.findAndAddVirtualProperties r3 = r2.getWrite()
            o.Instantiatable r7 = r2.getIconCompatParcelizer()
            float r8 = r2.getAudioAttributesImplBaseParcelizer()
            o.findViews r9 = r2.getAudioAttributesImplApi26Parcelizer()
            o.ValueInstantiatorsBase r11 = new o.ValueInstantiatorsBase
            r2 = r11
            r10 = r20
            r0 = r11
            r11 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r2 = r16.AudioAttributesImplBaseParcelizer()
            int r3 = r16.getAudioAttributesCompatParcelizer()
            r4 = r17
            IconCompatParcelizer(r4, r0, r2, r3)
            goto Lb1
        Laf:
            r4 = r17
        Lb1:
            int r15 = r15 + 1
            r0 = r18
            goto L45
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getValueClass.IconCompatParcelizer(android.text.Spannable, java.util.List, float, o.bufferMapProperty, o.withProperty):void");
    }

    private static final float RemoteActionCompatParcelizer(long j, float f, bufferMapProperty buffermapproperty) {
        if (ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j, ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer())) {
            return f;
        }
        long jWrite = ReadableObjectIdReferring.write(j);
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.read())) {
            return buffermapproperty.c_(j);
        }
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
            return ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j) * f;
        }
        return Float.NaN;
    }

    public static final void read(Spannable spannable, long j, float f, bufferMapProperty buffermapproperty, find findVar) {
        float f2 = read(j, f, buffermapproperty);
        if (Float.isNaN(f2)) {
            return;
        }
        Spannable spannable2 = spannable;
        IconCompatParcelizer(spannable, new BeanDeserializerModifier(f2, 0, (spannable2.length() == 0 || TestGroupLSModel.MediaBrowserCompatSearchResultReceiver(spannable2) == '\n') ? spannable.length() + 1 : spannable.length(), find.write.AudioAttributesCompatParcelizer(findVar.getRemoteActionCompatParcelizer()), find.write.RemoteActionCompatParcelizer(findVar.getRemoteActionCompatParcelizer()), findVar.getRead(), findVar.getWrite(), null), 0, spannable.length());
    }

    public static final void RemoteActionCompatParcelizer(Spannable spannable, long j, float f, bufferMapProperty buffermapproperty) {
        float f2 = read(j, f, buffermapproperty);
        if (Float.isNaN(f2)) {
            return;
        }
        IconCompatParcelizer(spannable, new findStdDeserializer(f2), 0, spannable.length());
    }

    private static final float read(long j, float f, bufferMapProperty buffermapproperty) {
        float fAudioAttributesCompatParcelizer;
        long jWrite = ReadableObjectIdReferring.write(j);
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.read())) {
            if (!read(buffermapproperty)) {
                return buffermapproperty.c_(j);
            }
            fAudioAttributesCompatParcelizer = ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j) / ReadableObjectIdReferring.AudioAttributesCompatParcelizer(buffermapproperty.RemoteActionCompatParcelizer(f));
        } else {
            if (!processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
                return Float.NaN;
            }
            fAudioAttributesCompatParcelizer = ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j);
        }
        return fAudioAttributesCompatParcelizer * f;
    }

    private static final boolean read(bufferMapProperty buffermapproperty) {
        return ((double) buffermapproperty.getIconCompatParcelizer()) > 1.05d;
    }

    public static final void read(Spannable spannable, deserializeWithObjectId deserializewithobjectid, List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list, bufferMapProperty buffermapproperty, getMagicModuleStat<? super _reportMissingSetter, ? super getDataStream, ? super withValueDeserializer, ? super _findFormat, ? extends Typeface> getmagicmodulestat) {
        MetricAffectingSpan metricAffectingSpanIconCompatParcelizer;
        AudioAttributesCompatParcelizer(spannable, deserializewithobjectid, list, getmagicmodulestat);
        List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = list.get(i);
            if (audioAttributesCompatParcelizer.IconCompatParcelizer() instanceof _findPropertyUnwrapper) {
                int iAudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
                int audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
                if (iAudioAttributesImplBaseParcelizer >= 0 && iAudioAttributesImplBaseParcelizer < spannable.length() && audioAttributesCompatParcelizer2 > iAudioAttributesImplBaseParcelizer && audioAttributesCompatParcelizer2 <= spannable.length()) {
                    read(spannable, (_findPropertyUnwrapper) audioAttributesCompatParcelizer.IconCompatParcelizer(), iAudioAttributesImplBaseParcelizer, audioAttributesCompatParcelizer2, buffermapproperty);
                    if (AudioAttributesCompatParcelizer((_findPropertyUnwrapper) audioAttributesCompatParcelizer.IconCompatParcelizer())) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer> audioAttributesCompatParcelizer3 = list.get(i2);
                AbstractDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = audioAttributesCompatParcelizer3.IconCompatParcelizer();
                if (remoteActionCompatParcelizerIconCompatParcelizer instanceof _findPropertyUnwrapper) {
                    int iAudioAttributesImplBaseParcelizer2 = audioAttributesCompatParcelizer3.AudioAttributesImplBaseParcelizer();
                    int audioAttributesCompatParcelizer4 = audioAttributesCompatParcelizer3.getAudioAttributesCompatParcelizer();
                    if (iAudioAttributesImplBaseParcelizer2 >= 0 && iAudioAttributesImplBaseParcelizer2 < spannable.length() && audioAttributesCompatParcelizer4 > iAudioAttributesImplBaseParcelizer2 && audioAttributesCompatParcelizer4 <= spannable.length() && (metricAffectingSpanIconCompatParcelizer = IconCompatParcelizer(((_findPropertyUnwrapper) remoteActionCompatParcelizerIconCompatParcelizer).getMediaBrowserCompatItemReceiver(), buffermapproperty)) != null) {
                        IconCompatParcelizer(spannable, metricAffectingSpanIconCompatParcelizer, iAudioAttributesImplBaseParcelizer2, audioAttributesCompatParcelizer4);
                    }
                }
            }
        }
    }

    private static final void read(Spannable spannable, _findPropertyUnwrapper _findpropertyunwrapper, int i, int i2, bufferMapProperty buffermapproperty) {
        write(spannable, _findpropertyunwrapper.getAudioAttributesImplApi21Parcelizer(), i, i2);
        AudioAttributesCompatParcelizer(spannable, _findpropertyunwrapper.read(), i, i2);
        RemoteActionCompatParcelizer(spannable, _findpropertyunwrapper.IconCompatParcelizer(), _findpropertyunwrapper.AudioAttributesCompatParcelizer(), i, i2);
        RemoteActionCompatParcelizer(spannable, _findpropertyunwrapper.getMediaMetadataCompat(), i, i2);
        AudioAttributesCompatParcelizer(spannable, _findpropertyunwrapper.getAudioAttributesCompatParcelizer(), buffermapproperty, i, i2);
        read(spannable, _findpropertyunwrapper.getMediaBrowserCompatCustomActionResultReceiver(), i, i2);
        IconCompatParcelizer(spannable, _findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer(), i, i2);
        AudioAttributesCompatParcelizer(spannable, _findpropertyunwrapper.getMediaBrowserCompatMediaItem(), i, i2);
        IconCompatParcelizer(spannable, _findpropertyunwrapper.getMediaDescriptionCompat(), i, i2);
        RemoteActionCompatParcelizer(spannable, _findpropertyunwrapper.getMediaBrowserCompatSearchResultReceiver(), i, i2);
        read(spannable, _findpropertyunwrapper.getOnCustomAction(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Spannable spannable, getMagicModuleStat getmagicmodulestat, _findPropertyUnwrapper _findpropertyunwrapper, int i, int i2) {
        _reportMissingSetter audioAttributesImplBaseParcelizer = _findpropertyunwrapper.getAudioAttributesImplBaseParcelizer();
        getDataStream remoteActionCompatParcelizer = _findpropertyunwrapper.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = getDataStream.INSTANCE.RemoteActionCompatParcelizer();
        }
        withValueDeserializer write = _findpropertyunwrapper.getWrite();
        withValueDeserializer withvaluedeserializerIconCompatParcelizer = withValueDeserializer.IconCompatParcelizer(write != null ? write.getIconCompatParcelizer() : withValueDeserializer.INSTANCE.IconCompatParcelizer());
        _findFormat read = _findpropertyunwrapper.getRead();
        spannable.setSpan(new modifyMapLikeDeserializer((Typeface) getmagicmodulestat.write(audioAttributesImplBaseParcelizer, remoteActionCompatParcelizer, withvaluedeserializerIconCompatParcelizer, _findFormat.write(read != null ? read.getRead() : _findFormat.INSTANCE.RemoteActionCompatParcelizer()))), i, i2, 33);
        return getShowPopup.INSTANCE;
    }

    public static final void RemoteActionCompatParcelizer(_findPropertyUnwrapper _findpropertyunwrapper, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> list, getModuleData<? super _findPropertyUnwrapper, ? super Integer, ? super Integer, getShowPopup> getmoduledata) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            getmoduledata.AudioAttributesCompatParcelizer(IconCompatParcelizer(_findpropertyunwrapper, list.get(0).IconCompatParcelizer()), Integer.valueOf(list.get(0).AudioAttributesImplBaseParcelizer()), Integer.valueOf(list.get(0).getAudioAttributesCompatParcelizer()));
            return;
        }
        int size = list.size();
        int i = size << 1;
        int[] iArr = new int[i];
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> list2 = list;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper> audioAttributesCompatParcelizer = list.get(i2);
            iArr[i2] = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
            iArr[i2 + size] = audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        }
        getOrderDetails.IconCompatParcelizer(iArr);
        int iWrite = getOrderDetails.write(iArr);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i4 != iWrite) {
                int size3 = list2.size();
                _findPropertyUnwrapper _findpropertyunwrapperIconCompatParcelizer = _findpropertyunwrapper;
                for (int i5 = 0; i5 < size3; i5++) {
                    AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper> audioAttributesCompatParcelizer2 = list.get(i5);
                    if (audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer() != audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer() && withAdditionalKeySerializers.RemoteActionCompatParcelizer(iWrite, i4, audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer())) {
                        _findpropertyunwrapperIconCompatParcelizer = IconCompatParcelizer(_findpropertyunwrapperIconCompatParcelizer, audioAttributesCompatParcelizer2.IconCompatParcelizer());
                    }
                }
                if (_findpropertyunwrapperIconCompatParcelizer != null) {
                    getmoduledata.AudioAttributesCompatParcelizer(_findpropertyunwrapperIconCompatParcelizer, Integer.valueOf(iWrite), Integer.valueOf(i4));
                }
                iWrite = i4;
            }
        }
    }

    private static final MetricAffectingSpan IconCompatParcelizer(long j, bufferMapProperty buffermapproperty) {
        long jWrite = ReadableObjectIdReferring.write(j);
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.read())) {
            return new modifyArrayDeserializer(buffermapproperty.c_(j));
        }
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
            return new isPotentialBeanType(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j));
        }
        return null;
    }

    private static final boolean AudioAttributesCompatParcelizer(_findPropertyUnwrapper _findpropertyunwrapper) {
        return processUnwrapped.read(ReadableObjectIdReferring.write(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver()), processUnwrapped.INSTANCE.read()) || processUnwrapped.read(ReadableObjectIdReferring.write(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver()), processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer());
    }

    private static final void RemoteActionCompatParcelizer(Spannable spannable, nopInstance nopinstance, int i, int i2) {
        if (nopinstance != null) {
            IconCompatParcelizer(spannable, new modifyKeyDeserializer(RequestPayload.IconCompatParcelizer(nopinstance.getIconCompatParcelizer()), Float.intBitsToFloat((int) (nopinstance.getWrite() >> 32)), Float.intBitsToFloat((int) nopinstance.getWrite()), ValueInstantiators.read(nopinstance.getAudioAttributesCompatParcelizer())), i, i2);
        }
    }

    private static final void read(Spannable spannable, findViews findviews, int i, int i2) {
        if (findviews != null) {
            IconCompatParcelizer(spannable, new _buildAliasMapping(findviews), i, i2);
        }
    }

    public static final void IconCompatParcelizer(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            IconCompatParcelizer(spannable, new BackgroundColorSpan(RequestPayload.IconCompatParcelizer(j)), i, i2);
        }
    }

    public static final void AudioAttributesCompatParcelizer(Spannable spannable, canCreateFromBoolean cancreatefromboolean, int i, int i2) {
        if (cancreatefromboolean != null) {
            IconCompatParcelizer(spannable, getDelegateCreator.INSTANCE.read(cancreatefromboolean), i, i2);
        }
    }

    private static final void IconCompatParcelizer(Spannable spannable, CreatorCandidate creatorCandidate, int i, int i2) {
        if (creatorCandidate != null) {
            IconCompatParcelizer(spannable, new ScaleXSpan(creatorCandidate.getRemoteActionCompatParcelizer()), i, i2);
            IconCompatParcelizer(spannable, new modifyEnumDeserializer(creatorCandidate.getRead()), i, i2);
        }
    }

    private static final void read(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            IconCompatParcelizer(spannable, new constructSettableProperty(str), i, i2);
        }
    }

    public static final void AudioAttributesCompatParcelizer(Spannable spannable, long j, bufferMapProperty buffermapproperty, int i, int i2) {
        long jWrite = ReadableObjectIdReferring.write(j);
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.read())) {
            IconCompatParcelizer(spannable, new AbsoluteSizeSpan(getOnline.RemoteActionCompatParcelizer(buffermapproperty.c_(j)), false), i, i2);
        } else if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
            IconCompatParcelizer(spannable, new RelativeSizeSpan(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j)), i, i2);
        }
    }

    public static final void RemoteActionCompatParcelizer(Spannable spannable, renameAll renameall, int i, int i2) {
        if (renameall != null) {
            IconCompatParcelizer(spannable, new updateBuilder(renameall.write(renameAll.INSTANCE.AudioAttributesCompatParcelizer()), renameall.write(renameAll.INSTANCE.RemoteActionCompatParcelizer())), i, i2);
        }
    }

    public static final void AudioAttributesCompatParcelizer(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            IconCompatParcelizer(spannable, new ForegroundColorSpan(RequestPayload.IconCompatParcelizer(j)), i, i2);
        }
    }

    private static final void write(Spannable spannable, _find2ViaAlias _find2viaalias, int i, int i2) {
        if (_find2viaalias != null) {
            IconCompatParcelizer(spannable, new createBeanDeserializer(_find2viaalias.getAudioAttributesCompatParcelizer()), i, i2);
        }
    }

    private static final void RemoteActionCompatParcelizer(Spannable spannable, Instantiatable instantiatable, float f, int i, int i2) {
        if (instantiatable != null) {
            if (instantiatable instanceof _hasOneOf) {
                AudioAttributesCompatParcelizer(spannable, ((_hasOneOf) instantiatable).getRead(), i, i2);
            } else {
                if (!(instantiatable instanceof throwInternal)) {
                    throw new RenewEligibleCreator();
                }
                IconCompatParcelizer(spannable, new BeanPropertyMap((throwInternal) instantiatable, f), i, i2);
            }
        }
    }

    private static final boolean write(deserializeWithObjectId deserializewithobjectid) {
        return ValueInstantiators.read(deserializewithobjectid.onRemoveQueueItemAt()) || deserializewithobjectid.RatingCompat() != null;
    }

    private static final _findPropertyUnwrapper IconCompatParcelizer(_findPropertyUnwrapper _findpropertyunwrapper, _findPropertyUnwrapper _findpropertyunwrapper2) {
        return _findpropertyunwrapper == null ? _findpropertyunwrapper2 : _findpropertyunwrapper.AudioAttributesCompatParcelizer(_findpropertyunwrapper2);
    }

    private static final void AudioAttributesCompatParcelizer(final Spannable spannable, deserializeWithObjectId deserializewithobjectid, List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list, final getMagicModuleStat<? super _reportMissingSetter, ? super getDataStream, ? super withValueDeserializer, ? super _findFormat, ? extends Typeface> getmagicmodulestat) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = list.get(i);
            if ((audioAttributesCompatParcelizer.IconCompatParcelizer() instanceof _findPropertyUnwrapper) && (ValueInstantiators.read((_findPropertyUnwrapper) audioAttributesCompatParcelizer.IconCompatParcelizer()) || ((_findPropertyUnwrapper) audioAttributesCompatParcelizer.IconCompatParcelizer()).getRead() != null)) {
                toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
                arrayList.add(audioAttributesCompatParcelizer);
            }
        }
        ArrayList arrayList2 = arrayList;
        RemoteActionCompatParcelizer(write(deserializewithobjectid) ? new _findPropertyUnwrapper(0L, 0L, deserializewithobjectid.MediaMetadataCompat(), deserializewithobjectid.MediaBrowserCompatMediaItem(), deserializewithobjectid.RatingCompat(), deserializewithobjectid.AudioAttributesImplBaseParcelizer(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList2, (getModuleData<? super _findPropertyUnwrapper, ? super Integer, ? super Integer, getShowPopup>) new getModuleData() { // from class: o.BeanAsArrayBuilderDeserializer
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return getValueClass.read(spannable, getmagicmodulestat, (_findPropertyUnwrapper) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }
}
