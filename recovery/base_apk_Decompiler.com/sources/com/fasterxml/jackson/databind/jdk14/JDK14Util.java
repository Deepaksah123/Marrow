package com.fasterxml.jackson.databind.jdk14;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.getColorInfoString;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public class JDK14Util {
    public static String[] getRecordFieldNames(Class<?> cls) {
        return RecordAccessor.instance().getRecordFieldNames(cls);
    }

    public static AnnotatedConstructor findRecordConstructor(AnnotatedClass annotatedClass, AnnotationIntrospector annotationIntrospector, MapperConfig<?> mapperConfig, List<String> list) {
        return new CreatorLocator(annotatedClass, annotationIntrospector, mapperConfig).locate(list);
    }

    static class RecordAccessor {
        private static final RecordAccessor INSTANCE;
        private static final RuntimeException PROBLEM;
        private final Method RECORD_COMPONENT_GET_NAME;
        private final Method RECORD_COMPONENT_GET_TYPE;
        private final Method RECORD_GET_RECORD_COMPONENTS;

        static {
            RecordAccessor recordAccessor = null;
            try {
                e = null;
                recordAccessor = new RecordAccessor();
            } catch (RuntimeException e) {
                e = e;
            }
            INSTANCE = recordAccessor;
            PROBLEM = e;
        }

        private RecordAccessor() throws RuntimeException {
            try {
                this.RECORD_GET_RECORD_COMPONENTS = Class.class.getMethod("getRecordComponents", new Class[0]);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.RECORD_COMPONENT_GET_NAME = cls.getMethod("getName", new Class[0]);
                this.RECORD_COMPONENT_GET_TYPE = cls.getMethod("getType", new Class[0]);
            } catch (Exception e) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e.getClass().getName(), e.getMessage()), e);
            }
        }

        public static RecordAccessor instance() {
            RuntimeException runtimeException = PROBLEM;
            if (runtimeException != null) {
                throw runtimeException;
            }
            return INSTANCE;
        }

        public String[] getRecordFieldNames(Class<?> cls) throws IllegalArgumentException {
            Object[] objArrRecordComponents = recordComponents(cls);
            if (objArrRecordComponents == null) {
                return null;
            }
            String[] strArr = new String[objArrRecordComponents.length];
            for (int i = 0; i < objArrRecordComponents.length; i++) {
                try {
                    strArr[i] = (String) this.RECORD_COMPONENT_GET_NAME.invoke(objArrRecordComponents[i], new Object[0]);
                } catch (Exception e) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrRecordComponents.length), ClassUtil.nameOf(cls)), e);
                }
            }
            return strArr;
        }

        public RawTypeName[] getRecordFields(Class<?> cls) throws IllegalArgumentException {
            Object[] objArrRecordComponents = recordComponents(cls);
            if (objArrRecordComponents == null) {
                return null;
            }
            RawTypeName[] rawTypeNameArr = new RawTypeName[objArrRecordComponents.length];
            for (int i = 0; i < objArrRecordComponents.length; i++) {
                try {
                    try {
                        rawTypeNameArr[i] = new RawTypeName((Class) this.RECORD_COMPONENT_GET_TYPE.invoke(objArrRecordComponents[i], new Object[0]), (String) this.RECORD_COMPONENT_GET_NAME.invoke(objArrRecordComponents[i], new Object[0]));
                    } catch (Exception e) {
                        throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrRecordComponents.length), ClassUtil.nameOf(cls)), e);
                    }
                } catch (Exception e2) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrRecordComponents.length), ClassUtil.nameOf(cls)), e2);
                }
            }
            return rawTypeNameArr;
        }

        protected Object[] recordComponents(Class<?> cls) throws IllegalArgumentException {
            try {
                return (Object[]) this.RECORD_GET_RECORD_COMPONENTS.invoke(cls, new Object[0]);
            } catch (Exception e) {
                if (NativeImageUtil.isUnsupportedFeatureError(e)) {
                    return null;
                }
                StringBuilder sb = new StringBuilder("Failed to access RecordComponents of type ");
                sb.append(ClassUtil.nameOf(cls));
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public static class RawTypeName {
        public final String name;
        public final Class<?> rawType;
        private static final byte[] $$a = {18, -127, -77, -105, -19, -10, -3, 20, -6, 5};
        private static final int $$b = 249;
        private static int RemoteActionCompatParcelizer = 0;
        private static int IconCompatParcelizer = 1;

        private static void a(byte b, byte b2, int i, Object[] objArr) {
            byte[] bArr = $$a;
            int i2 = b2 + 4;
            int i3 = (b * 39) + 75;
            int i4 = i * 3;
            byte[] bArr2 = new byte[4 - i4];
            int i5 = 3 - i4;
            int i6 = -1;
            if (bArr == null) {
                i3 = i5 + i3 + 6;
            }
            while (true) {
                i2++;
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3 = i3 + bArr[i2] + 6;
            }
        }

        public RawTypeName(Class<?> cls, String str) {
            this.rawType = cls;
            this.name = str;
        }

        public static Object[] AudioAttributesCompatParcelizer(int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11 = 2 % 2;
            int i12 = RemoteActionCompatParcelizer;
            int i13 = (i12 & 75) + (i12 | 75);
            IconCompatParcelizer = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(2136229562);
                if (objRemoteActionCompatParcelizer == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iLastIndexOf = 1503 - TextUtils.lastIndexOf("", '0');
                    int i15 = 22 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b = (byte) ($$b & 7);
                    byte b2 = (byte) (-b);
                    Object[] objArr = new Object[1];
                    a(b, b2, (byte) (b2 + 1), objArr);
                    objRemoteActionCompatParcelizer = startForeground.read(pressedStateDuration, iLastIndexOf, i15, 18711087, false, (String) objArr[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).longValue();
                long j = 88650989;
                long j2 = -1;
                long j3 = j ^ j2;
                long j4 = i;
                long j5 = (jLongValue | j4) ^ j2;
                long j6 = (((long) (-109)) * j) + (((long) 111) * jLongValue) + (((long) (-220)) * (j3 | j5)) + (((long) 220) * (((j | jLongValue) ^ j2) | j5)) + (((long) 110) * (((j3 | jLongValue) ^ j2) | (((jLongValue ^ j2) | j) ^ j2))) + ((long) (-554648191));
                int i16 = (~new Random().nextInt(1900426458)) | (-1503178798);
                int i17 = ((int) (j6 >> 32)) & ((-636347799) + (i16 * 495) + (((~i16) | (-1505557040)) * 495));
                int i18 = (((~((-1048918) | i)) | 1346470912) * 449) + 141708352;
                int i19 = ~i;
                int i20 = ((int) j6) & (i18 + (((~((-1048918) | i19)) | 1346470912) * 449));
                if (((i20 & i17) | (i17 ^ i20)) != 0) {
                    int i21 = IconCompatParcelizer;
                    int i22 = (i21 ^ 55) + ((i21 & 55) << 1);
                    RemoteActionCompatParcelizer = i22 % 128;
                    int i23 = i22 % 2;
                    i4 = 1;
                } else {
                    int i24 = IconCompatParcelizer;
                    int i25 = ((i24 | 43) << 1) - (i24 ^ 43);
                    RemoteActionCompatParcelizer = i25 % 128;
                    int i26 = i25 % 2;
                    i4 = 0;
                }
                int i27 = -i4;
                int i28 = ((i4 & i27) | (i4 ^ i27)) >> 31;
                int i29 = (~i28) & i;
                int i30 = i28 & (i ^ 264);
                int i31 = (i30 & i29) | (i29 ^ i30);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1907585030);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i32 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4117;
                    int i33 = 41 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte b3 = (byte) ($$b & 7);
                    byte b4 = (byte) (-b3);
                    Object[] objArr2 = new Object[1];
                    a(b3, b4, (byte) (b4 + 1), objArr2);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, i32, i33, 268088467, false, (String) objArr2[0], new Class[0]);
                }
                long jLongValue2 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, null)).longValue();
                long j7 = 1647171187;
                long j8 = 140;
                long j9 = (j7 ^ j2) | jLongValue2;
                long j10 = j4 ^ j2;
                long j11 = (((long) 141) * j7) + (((long) (-279)) * jLongValue2) + ((jLongValue2 | j4) * j8) + (((long) (-280)) * ((j9 ^ j2) | ((j10 | jLongValue2) ^ j2))) + (j8 * ((((jLongValue2 ^ j2) | j7) ^ j2) | ((j10 | j7) ^ j2) | ((j9 | j4) ^ j2))) + ((long) 332834695);
                if (((((int) (j11 >> 32)) & ((((~((-417513182) | i)) | 606414864) * 262) + 41287452 + (((~((-417513182) | i19)) | 606414864) * 262))) | (((int) j11) & (((818885255 + ((i19 | (-1431961344)) * 1324)) + (((~((-1415116476) | i)) | (~((-22109935) | i))) * (-1324))) - 419869746))) != 0) {
                    int i34 = IconCompatParcelizer;
                    int i35 = (i34 ^ 109) + ((i34 & 109) << 1);
                    RemoteActionCompatParcelizer = i35 % 128;
                    int i36 = i35 % 2;
                    i5 = i19;
                    i6 = (i & (-282)) | (i5 & 281);
                    int i37 = ((i34 | 51) << 1) - (i34 ^ 51);
                    RemoteActionCompatParcelizer = i37 % 128;
                    if (i37 % 2 != 0) {
                        int i38 = 4 / 5;
                    }
                } else {
                    i5 = i19;
                    i6 = i;
                }
                int i39 = ((~i31) & i) | (i31 & i5);
                int i40 = RemoteActionCompatParcelizer;
                int i41 = (i40 & 17) + (i40 | 17);
                int i42 = i41 % 128;
                IconCompatParcelizer = i42;
                int i43 = i41 % 2;
                int i44 = -i39;
                int i45 = ((i39 & i44) | (i39 ^ i44)) >> 31;
                int i46 = ~i45;
                int i47 = ((i42 | 109) << 1) - (i42 ^ 109);
                RemoteActionCompatParcelizer = i47 % 128;
                int i48 = i47 % 2;
                int i49 = i6 & i46;
                int i50 = i45 & i31;
                int i51 = (i50 & i49) | (i49 ^ i50);
                if ((i2 & 16384) == 0) {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1491817860);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int i52 = 4020 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int iRed = 19 - Color.red(0);
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 2);
                        Object[] objArr3 = new Object[1];
                        a(b5, b6, (byte) (b6 - 2), objArr3);
                        objRemoteActionCompatParcelizer3 = startForeground.read(cCombineMeasuredStates, i52, iRed, -648188183, false, (String) objArr3[0], new Class[0]);
                    }
                    long jLongValue3 = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, null)).longValue();
                    long j12 = -672661175;
                    long j13 = (((long) (-129)) * j12) + (((long) TarConstants.PREFIXLEN_XSTAR) * jLongValue3);
                    long j14 = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
                    long j15 = jLongValue3 ^ j2;
                    long j16 = j13 + ((((j15 | j10) | j12) ^ j2) * j14);
                    long j17 = j15 | j12;
                    long j18 = j16 + (((long) (-260)) * (j17 ^ j2)) + (j14 * ((((j12 ^ j2) | jLongValue3) ^ j2) | ((j17 | j4) ^ j2))) + ((long) (-339182812));
                    int i53 = ((int) (j18 >> 32)) & (406173765 + (((~((-1061376964) | i5)) | (~((-375849448) | i))) * 217) + (((~((-1061376964) | i)) | 373490115) * 217) + (((~((-375849448) | i5)) | 1061376963) * 217));
                    int iNextInt = new Random().nextInt();
                    int i54 = ~iNextInt;
                    int i55 = ((int) j18) & (1942339303 + (((~((-1719495602) | i54)) | 5308929) * (-108)) + (((~(i54 | 282269191)) | (~((-282269192) | iNextInt)) | (-1996455864)) * 54) + ((iNextInt | (-1996455864)) * 54));
                    int i56 = (i53 & i55) | (i53 ^ i55);
                    int i57 = (~(i & 268)) & (i | 268);
                    int i58 = -i56;
                    int i59 = ((i56 & i58) | (i56 ^ i58)) >> 31;
                    int i60 = IconCompatParcelizer + 17;
                    int i61 = i60 % 128;
                    RemoteActionCompatParcelizer = i61;
                    int i62 = i60 % 2;
                    int i63 = (i59 & i57) | ((~i59) & i);
                    int i64 = i ^ i51;
                    int i65 = (i61 ^ 103) + ((i61 & 103) << 1);
                    IconCompatParcelizer = i65 % 128;
                    int i66 = i65 % 2 == 0 ? (i64 | (-i64)) >> 117 : (i64 | (-i64)) >> 31;
                    int i67 = i63 & (~i66);
                    int i68 = i51 & i66;
                    i51 = (i67 ^ i68) | (i67 & i68);
                }
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-375411667);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 4019;
                    int scrollDefaultDelay = 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b7 = (byte) ($$b & 7);
                    byte b8 = (byte) (-b7);
                    Object[] objArr4 = new Object[1];
                    a(b7, b8, (byte) (b8 + 1), objArr4);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cResolveOpacity, deadChar, scrollDefaultDelay, -1747556168, false, (String) objArr4[0], new Class[0]);
                }
                long jLongValue4 = ((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, null)).longValue();
                long j19 = 500189689;
                long j20 = jLongValue4 ^ j2;
                long j21 = 676;
                long j22 = (((long) 677) * j19) + (((long) (-675)) * jLongValue4) + (((long) (-676)) * (j19 | j4 | j20)) + ((((j20 | j19) ^ j2) | ((j10 | j19) ^ j2)) * j21) + (j21 * ((((j19 ^ j2) | j20) ^ j2) | ((j20 | j10) ^ j2) | (((jLongValue4 | j19) | j4) ^ j2))) + ((long) 447371279);
                int i69 = (-1079137782) + ((1878686717 | i5) * 184) + (((~(1668444540 | i5)) | 1857710765) * 184);
                int i70 = RemoteActionCompatParcelizer;
                int i71 = (i70 & 73) + (i70 | 73);
                IconCompatParcelizer = i71 % 128;
                int i72 = i71 % 2;
                int i73 = ((int) (j22 >> 32)) & i69;
                int iMyTid = Process.myTid();
                int i74 = 1296243140 + (((~((~iMyTid) | (-1600988501))) | 352657492) * (-245));
                int i75 = ~(iMyTid | (-1600988501));
                int i76 = i73 | (((int) j22) & (i74 + (i75 * (-245)) + ((i75 | 1256752385) * 245)));
                int i77 = (~(i & 266)) & (i | 266);
                int i78 = -i76;
                int i79 = ((i76 & i78) | (i76 ^ i78)) >> 31;
                int i80 = (~i79) & i;
                int i81 = i79 & i77;
                int i82 = ((~i51) & i) | (i51 & i5);
                int i83 = (i82 | (-i82)) >> 31;
                int i84 = ((i81 & i80) | (i80 ^ i81)) & (~i83);
                int i85 = i51 & i83;
                int i86 = (i84 & i85) | (i84 ^ i85);
                if ((i2 & 524288) == 0) {
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1878396060);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31603);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3694;
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 28;
                        byte b9 = (byte) ($$b & 7);
                        byte b10 = (byte) (-b9);
                        Object[] objArr5 = new Object[1];
                        a(b9, b10, (byte) (b10 + 1), objArr5);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c, fadingEdgeLength, packedPositionChild, 297781257, false, (String) objArr5[0], new Class[0]);
                    }
                    long jLongValue5 = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, null)).longValue();
                    long j23 = -412598430;
                    long j24 = -661;
                    long j25 = j23 ^ j2;
                    long j26 = jLongValue5 ^ j2;
                    long j27 = (j24 * j23) + (j24 * jLongValue5) + (((long) 1324) * (j10 | ((j25 | j26) ^ j2))) + (((long) (-1324)) * (((j23 | j4) ^ j2) | ((jLongValue5 | j4) ^ j2))) + (((long) 662) * (((j25 | jLongValue5) ^ j2) | ((j26 | j23) ^ j2))) + ((long) (-748689174));
                    int i87 = ((int) (j27 >> 32)) & (731954875 + (((~((-1577375852) | i5)) | (~((-140149441) | i))) * 333) + (((~((-1577375852) | i)) | (~(i5 | (-140149441)))) * 333));
                    int i88 = ((int) j27) & ((((~((-1620361605) | i)) | 183135194) * 56) + 1662805725 + (((-1620361605) | (~(183135194 | i5))) * 56));
                    int i89 = (i87 & i88) | (i87 ^ i88);
                    if (i89 > 0 && (i89 != 3 || (i2 & 268435456) == 0)) {
                        int i90 = (~(i & 280)) & (i | 280);
                        int i91 = (~(i & i86)) & (i | i86);
                        int i92 = RemoteActionCompatParcelizer + 49;
                        int i93 = i92 % 128;
                        IconCompatParcelizer = i93;
                        if (i92 % 2 == 0) {
                            int i94 = -i91;
                            i10 = ((i91 & i94) | (i91 ^ i94)) >>> 48;
                        } else {
                            int i95 = -i91;
                            i10 = ((i91 & i95) | (i91 ^ i95)) >> 31;
                        }
                        int i96 = i90 & (~i10);
                        int i97 = i86 & i10;
                        i86 = (i97 & i96) | (i96 ^ i97);
                        int i98 = (i93 & 21) + (i93 | 21);
                        RemoteActionCompatParcelizer = i98 % 128;
                        if (i98 % 2 != 0) {
                            int i99 = 3 % 4;
                        }
                    }
                    int i100 = ~i89;
                    int i101 = -i100;
                    int i102 = ((i100 & i101) | (i100 ^ i101)) >> 31;
                    int i103 = (i ^ 287) & (~i102);
                    int i104 = i102 & i;
                    int i105 = RemoteActionCompatParcelizer;
                    int i106 = ((i105 | 107) << 1) - (i105 ^ 107);
                    int i107 = i106 % 128;
                    IconCompatParcelizer = i107;
                    if (i106 % 2 == 0) {
                        i7 = i104 | i103;
                        int i108 = i ^ i86;
                        int i109 = -i108;
                        i8 = (i108 & i109) | (i108 ^ i109);
                        i9 = 8;
                    } else {
                        i7 = (i104 & i103) | (i103 ^ i104);
                        int i110 = ((~i86) & i) | (i86 & i5);
                        int i111 = -i110;
                        i8 = (i110 & i111) | (i110 ^ i111);
                        i9 = 31;
                    }
                    int i112 = i107 + 53;
                    RemoteActionCompatParcelizer = i112 % 128;
                    if (i112 % 2 != 0) {
                        int i113 = i8 << i9;
                        i86 = (i86 & i113) | (i7 & (~i113));
                    } else {
                        int i114 = i8 >> i9;
                        int i115 = i7 & (~i114);
                        int i116 = i86 & i114;
                        i86 = (i116 & i115) | (i115 ^ i116);
                    }
                }
                byte[] bArr = new byte[16];
                Object[] objArr6 = {bArr};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1196681127);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cGreen = (char) Color.green(0);
                    int deadChar2 = 1904 - KeyEvent.getDeadChar(0, 0);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 43;
                    byte b11 = (byte) ($$b & 7);
                    byte b12 = (byte) (-b11);
                    Object[] objArr7 = new Object[1];
                    a(b11, b12, (byte) (b12 + 1), objArr7);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cGreen, deadChar2, windowTouchSlop, -958014260, false, (String) objArr7[0], new Class[]{byte[].class});
                }
                long jLongValue6 = ((Long) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr6)).longValue();
                long j28 = -247569355;
                long j29 = j28 ^ j2;
                long j30 = (j29 | j10) ^ j2;
                long j31 = 338;
                long j32 = (((long) (-337)) * j28) + (((long) 339) * jLongValue6) + (((long) (-338)) * (j30 | (((jLongValue6 ^ j2) | j28) ^ j2) | ((j28 | j4) ^ j2))) + (((j29 | jLongValue6) ^ j2) * j31) + (j31 * (j30 | (((jLongValue6 | j28) | j4) ^ j2))) + ((long) 1117625926);
                int iMyTid2 = Process.myTid();
                int i117 = ((int) (j32 >> 32)) & (1462665642 + (((~((-1180473857) | iMyTid2)) | 256752554) * (-366)) + (((~(iMyTid2 | (-1074790401))) | 151069098) * 366));
                int i118 = ((int) j32) & (988380690 + (((~((-276938903) | i)) | (~((-1714165313) | i))) * 69) + (((~(1852585544 | i)) | (-2129524447) | (~(415359134 | i))) * (-69)) + 961061416);
                int i119 = (i117 & i118) | (i117 ^ i118);
                int i120 = (~(i & 313)) & (i | 313);
                int i121 = -i119;
                int i122 = ((i119 & i121) | (i119 ^ i121)) >> 31;
                int i123 = (~i122) & i;
                int i124 = i122 & i120;
                int i125 = (i124 & i123) | (i123 ^ i124);
                String[] strArr = {Base64.encodeToString(bArr, 0)};
                Object[] objArr8 = new Object[2];
                int i126 = ((~i86) & i) | (i86 & i5);
                int i127 = RemoteActionCompatParcelizer;
                int i128 = (i127 ^ 103) + ((i127 & 103) << 1);
                int i129 = i128 % 128;
                IconCompatParcelizer = i129;
                int i130 = i128 % 2;
                int i131 = ((i126 | (-i126)) >> 31) & 1;
                int i132 = -i131;
                int i133 = (~(((i132 & i131) | (i131 ^ i132)) >> 31)) & 1;
                objArr8[i131] = strArr;
                objArr8[i133] = null;
                String[] strArr2 = (String[]) objArr8[0];
                int i134 = (~(i & i86)) & (i | i86);
                int i135 = -i134;
                int i136 = ((i134 & i135) | (i134 ^ i135)) >> 31;
                int i137 = i125 & (~i136);
                int i138 = i86 & i136;
                int i139 = (i138 & i137) | (i137 ^ i138);
                Object[] objArr9 = {strArr2, new int[1], new int[]{i}, new int[]{i139}};
                int i140 = (i129 ^ 17) + ((i129 & 17) << 1);
                RemoteActionCompatParcelizer = i140 % 128;
                int i141 = i140 % 2;
                int i142 = (~(i & i139)) & (i | i139);
                int i143 = -i142;
                int i144 = (-1594928024) + ((~((-1734907179) | i5)) * 979) + ((i | 239648379) * (-979)) + (((~(i | (-1734907179))) | (~(i5 | 239648379))) * 979);
                int i145 = -(-((((i142 & i143) | (i142 ^ i143)) >> 31) & 16));
                int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                int iWrite = getColorInfoString.write();
                int i147 = i146 * 375;
                int i148 = -(-(i3 * (-747)));
                int i149 = (i147 & i148) + (i147 | i148);
                int i150 = ~i146;
                int i151 = ~((i150 ^ i3) | (i150 & i3));
                int i152 = ~iWrite;
                int i153 = (i151 | (~((i152 & i146) | (i152 ^ i146)))) * (-374);
                int i154 = ((i149 | i153) << 1) - (i153 ^ i149);
                int i155 = ~i3;
                int i156 = (~((i155 ^ i146) | (i155 & i146))) * 748;
                int i157 = ~(i150 | i155);
                int i158 = ~iWrite;
                int i159 = ~((i158 & i146) | (i158 ^ i146));
                int i160 = (((i154 & i156) + (i156 | i154)) - (~(((i159 & i157) | (i157 ^ i159)) * 374))) - 1;
                int i161 = i160 << 13;
                int i162 = (i161 & (~i160)) | ((~i161) & i160);
                int i163 = i162 >>> 17;
                int i164 = ((~i162) & i163) | ((~i163) & i162);
                int i165 = i164 << 5;
                ((int[]) objArr9[1])[0] = ((~i164) & i165) | ((~i165) & i164);
                return objArr9;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    static class CreatorLocator {
        protected final MapperConfig<?> _config;
        protected final List<AnnotatedConstructor> _constructors;
        protected final AnnotationIntrospector _intr;
        protected final AnnotatedConstructor _primaryConstructor;
        protected final AnnotatedClass _recordClass;
        protected final RawTypeName[] _recordFields;

        CreatorLocator(AnnotatedClass annotatedClass, AnnotationIntrospector annotationIntrospector, MapperConfig<?> mapperConfig) {
            int i;
            this._recordClass = annotatedClass;
            this._intr = annotationIntrospector;
            this._config = mapperConfig;
            RawTypeName[] recordFields = RecordAccessor.instance().getRecordFields(annotatedClass.getRawType());
            this._recordFields = recordFields;
            AnnotatedConstructor defaultConstructor = null;
            if (recordFields == null) {
                this._constructors = annotatedClass.getConstructors();
                this._primaryConstructor = null;
                return;
            }
            int length = recordFields.length;
            if (length == 0) {
                defaultConstructor = annotatedClass.getDefaultConstructor();
                this._constructors = Collections.singletonList(defaultConstructor);
            } else {
                List<AnnotatedConstructor> constructors = annotatedClass.getConstructors();
                this._constructors = constructors;
                Iterator<AnnotatedConstructor> it = constructors.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnnotatedConstructor next = it.next();
                    if (next.getParameterCount() == length) {
                        while (i < length) {
                            i = next.getRawParameterType(i).equals(this._recordFields[i].rawType) ? i + 1 : 0;
                        }
                        defaultConstructor = next;
                        break loop0;
                    }
                }
            }
            if (defaultConstructor == null) {
                StringBuilder sb = new StringBuilder("Failed to find the canonical Record constructor of type ");
                sb.append(ClassUtil.getTypeDescription(this._recordClass.getType()));
                throw new IllegalArgumentException(sb.toString());
            }
            this._primaryConstructor = defaultConstructor;
        }

        public AnnotatedConstructor locate(List<String> list) {
            for (AnnotatedConstructor annotatedConstructor : this._constructors) {
                JsonCreator.Mode modeFindCreatorAnnotation = this._intr.findCreatorAnnotation(this._config, annotatedConstructor);
                if (modeFindCreatorAnnotation != null && JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation && (JsonCreator.Mode.DELEGATING == modeFindCreatorAnnotation || annotatedConstructor != this._primaryConstructor)) {
                    return null;
                }
            }
            RawTypeName[] rawTypeNameArr = this._recordFields;
            if (rawTypeNameArr == null) {
                return null;
            }
            for (RawTypeName rawTypeName : rawTypeNameArr) {
                list.add(rawTypeName.name);
            }
            return this._primaryConstructor;
        }
    }
}
