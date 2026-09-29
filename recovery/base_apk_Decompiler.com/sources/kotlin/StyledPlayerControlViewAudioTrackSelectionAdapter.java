package kotlin;

import com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda19;
import com.google.android.exoplayer2.source.rtsp.RtpDataLoadable;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda50;
import kotlin.WalletConstantsBillingAddressFormat;
import kotlin.selectModule;
import kotlin.setPreferImmediatelyAvailableCredentials;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/* JADX INFO: loaded from: classes5.dex */
public final class StyledPlayerControlViewAudioTrackSelectionAdapter {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i4);
        int i11 = i9 | i10 | (~(i8 | i4));
        int i12 = i10 | i2;
        int i13 = ~i4;
        int i14 = (~(i2 | i13 | i5)) | (~(i7 | i13 | i8)) | (~(i8 | i5 | i4));
        int i15 = i5 + i4 + i3 + ((-1329026341) * i) + ((-1277752516) * i6);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i5) - 1912602624) + ((-659060787) * i4) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i3) + (494927872 * i) + (1577058304 * i6) + ((-1783103488) * i16);
        int i18 = (i5 * 595972471) + 129777640 + (i4 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i3 * 595972219) + (i * (-1341978823)) + (i6 * 731850196) + (i16 * 1869086720);
        switch (i17 + (i18 * i18 * (-846725120))) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                return IconCompatParcelizer(objArr);
            case 3:
                return AudioAttributesCompatParcelizer(objArr);
            case 4:
                return write(objArr);
            case 5:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 6:
                return MediaBrowserCompatItemReceiver(objArr);
            case 7:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 8:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 9:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 10:
                return MediaBrowserCompatMediaItem(objArr);
            case 11:
                return MediaMetadataCompat(objArr);
            case 12:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            default:
                return read(objArr);
        }
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        Element element = (Element) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = read;
        int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
        RemoteActionCompatParcelizer = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(element, "");
            toMagicModuleMetaRepoModel.write(str, "");
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(element, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String str3 = str2;
        if (str3 != null) {
            int i4 = read;
            int i5 = i4 & 97;
            int i6 = ((i4 | 97) & (~i5)) + (i5 << 1);
            RemoteActionCompatParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                str3.length();
                obj.hashCode();
                throw null;
            }
            if (str3.length() != 0) {
                element.setAttribute(str, str2);
                int i7 = read;
                int i8 = (i7 | 53) << 1;
                int i9 = -(((~i7) & 53) | (i7 & (-54)));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                RemoteActionCompatParcelizer = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        int i12 = RemoteActionCompatParcelizer;
        int i13 = ((i12 ^ 68) + ((i12 & 68) << 1)) - 1;
        read = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        Element element = (Element) objArr[0];
        Document document = (Document) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        read = i3 % 128;
        int i4 = i3 % 2;
        String str3 = "";
        toMagicModuleMetaRepoModel.write(element, "");
        toMagicModuleMetaRepoModel.write(document, "");
        int i5 = RemoteActionCompatParcelizer;
        int i6 = (-2) - ((((i5 | 122) << 1) - (i5 ^ 122)) ^ (-1));
        read = i6 % 128;
        int i7 = i6 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        if (str2 == null) {
            int i8 = read;
            int i9 = i8 & 125;
            int i10 = (i8 ^ 125) | i9;
            int i11 = (i9 & i10) + (i10 | i9);
            int i12 = i11 % 128;
            RemoteActionCompatParcelizer = i12;
            int i13 = i11 % 2;
            int i14 = i12 ^ 61;
            int i15 = (((i12 & 61) | i14) << 1) - i14;
            read = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = RemoteActionCompatParcelizer;
            int i18 = i17 & 79;
            int i19 = i18 + ((i17 ^ 79) | i18);
            read = i19 % 128;
            int i20 = i19 % 2;
            str3 = str2;
        }
        if (str3.length() > 0) {
            int i21 = RemoteActionCompatParcelizer;
            int i22 = i21 & 89;
            int i23 = ((i21 ^ 89) | i22) << 1;
            int i24 = -((i21 | 89) & (~i22));
            int i25 = (i23 & i24) + (i24 | i23);
            read = i25 % 128;
            int i26 = i25 % 2;
            Element elementCreateElement = document.createElement(str);
            Text textCreateTextNode = document.createTextNode(str2);
            int i27 = read;
            int i28 = (i27 ^ 43) + ((i27 & 43) << 1);
            RemoteActionCompatParcelizer = i28 % 128;
            int i29 = i28 % 2;
            elementCreateElement.appendChild(textCreateTextNode);
            element.appendChild(elementCreateElement);
            int i30 = read;
            int i31 = ((i30 & (-84)) | ((~i30) & 83)) + ((i30 & 83) << 1);
            int i32 = i31 % 128;
            RemoteActionCompatParcelizer = i32;
            if (i31 % 2 == 0) {
                int i33 = 76 / 0;
            }
            int i34 = i32 | 69;
            int i35 = i34 << 1;
            int i36 = -((~(i32 & 69)) & i34);
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            read = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = read + 41;
        RemoteActionCompatParcelizer = i39 % 128;
        int i40 = i39 % 2;
        return null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        onFullScreenModeChanged onfullscreenmodechanged = (onFullScreenModeChanged) objArr[0];
        Document document = (Document) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = (i2 & 89) + (i2 | 89);
        read = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(onfullscreenmodechanged, "");
            toMagicModuleMetaRepoModel.write(document, "");
            int i4 = 65 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(onfullscreenmodechanged, "");
            toMagicModuleMetaRepoModel.write(document, "");
        }
        int i5 = read;
        int i6 = i5 & 93;
        int i7 = -(-((i5 ^ 93) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        RemoteActionCompatParcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(document.createElement("S"));
            throw null;
        }
        Element elementCreateElement = document.createElement("S");
        toMagicModuleMetaRepoModel.write(elementCreateElement);
        int i9 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i10 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "d", (String) onFullScreenModeChanged.RemoteActionCompatParcelizer(i9, -1664579190, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 1664579192, new Object[]{onfullscreenmodechanged}, i10)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i11 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i12 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        String str = (String) onFullScreenModeChanged.RemoteActionCompatParcelizer(i11, -2013641384, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 2013641387, new Object[]{onfullscreenmodechanged}, i12);
        int i13 = RemoteActionCompatParcelizer;
        int i14 = (i13 ^ 97) + ((i13 & 97) << 1);
        read = i14 % 128;
        if (i14 % 2 != 0) {
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "r", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int i15 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
            int i16 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "t", (String) onFullScreenModeChanged.RemoteActionCompatParcelizer(i15, -381761314, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 381761314, new Object[]{onfullscreenmodechanged}, i16)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            throw null;
        }
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "r", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i17 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i18 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "t", (String) onFullScreenModeChanged.RemoteActionCompatParcelizer(i17, -381761314, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 381761314, new Object[]{onfullscreenmodechanged}, i18)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i19 = read;
        int i20 = (-2) - ((((i19 | 108) << 1) - (i19 ^ 108)) ^ (-1));
        RemoteActionCompatParcelizer = i20 % 128;
        if (i20 % 2 != 0) {
            return elementCreateElement;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        Element elementCreateElement;
        Iterator it;
        StyledPlayerControlViewSettingViewHolder styledPlayerControlViewSettingViewHolder = (StyledPlayerControlViewSettingViewHolder) objArr[0];
        Document document = (Document) objArr[1];
        int i = 2 % 2;
        int i2 = read;
        int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(styledPlayerControlViewSettingViewHolder, "");
        toMagicModuleMetaRepoModel.write(document, "");
        int i5 = read + 35;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            elementCreateElement = document.createElement("SegmentTimeline");
            int iAudioAttributesCompatParcelizer = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
            it = ((List) StyledPlayerControlViewSettingViewHolder.AudioAttributesCompatParcelizer(1561159178, new Object[]{styledPlayerControlViewSettingViewHolder}, WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1561159177)).iterator();
            int i6 = 60 / 0;
        } else {
            elementCreateElement = document.createElement("SegmentTimeline");
            int iAudioAttributesCompatParcelizer3 = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer4 = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
            it = ((List) StyledPlayerControlViewSettingViewHolder.AudioAttributesCompatParcelizer(1561159178, new Object[]{styledPlayerControlViewSettingViewHolder}, WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer4, iAudioAttributesCompatParcelizer3, -1561159177)).iterator();
        }
        int i7 = read;
        int i8 = (i7 & 51) + (i7 | 51);
        RemoteActionCompatParcelizer = i8 % 128;
        int i9 = i8 % 2;
        while (it.hasNext()) {
            int i10 = read + 58;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            RemoteActionCompatParcelizer = i11 % 128;
            Object obj = null;
            if (i11 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Element element = (Element) AudioAttributesCompatParcelizer(new Object[]{(onFullScreenModeChanged) it.next(), document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1143365091, 1143365095, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int i12 = read + 19;
            RemoteActionCompatParcelizer = i12 % 128;
            if (i12 % 2 == 0) {
                elementCreateElement.appendChild(element);
                throw null;
            }
            elementCreateElement.appendChild(element);
            int i13 = read;
            int i14 = i13 & 97;
            int i15 = (i13 | 97) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            RemoteActionCompatParcelizer = i17 % 128;
            int i18 = i17 % 2;
        }
        toMagicModuleMetaRepoModel.write(elementCreateElement);
        int i19 = read;
        int i20 = i19 ^ 33;
        int i21 = ((((i19 & 33) | i20) << 1) - (~(-i20))) - 1;
        RemoteActionCompatParcelizer = i21 % 128;
        int i22 = i21 % 2;
        return elementCreateElement;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = (StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0) objArr[0];
        Document document = (Document) objArr[1];
        int i = 2 % 2;
        int i2 = read;
        int i3 = (i2 | 45) << 1;
        int i4 = -(i2 ^ 45);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, "");
            toMagicModuleMetaRepoModel.write(document, "");
            int i6 = 52 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, "");
            toMagicModuleMetaRepoModel.write(document, "");
        }
        Element elementCreateElement = document.createElement("SegmentTemplate");
        int i7 = RemoteActionCompatParcelizer + 123;
        read = i7 % 128;
        int i8 = i7 % 2;
        toMagicModuleMetaRepoModel.write(elementCreateElement);
        String str = (String) StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0}, 77834659, ai.write(), ai.write(), ai.write(), -77834658, ai.write());
        int i9 = RemoteActionCompatParcelizer;
        int i10 = (i9 & 85) + (i9 | 85);
        read = i10 % 128;
        if (i10 % 2 != 0) {
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "timescale", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            throw null;
        }
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "timescale", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "media", (String) StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0}, -675965753, ai.write(), ai.write(), ai.write(), 675965757, ai.write())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        String str2 = (String) StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0}, -826629913, ai.write(), ai.write(), ai.write(), 826629918, ai.write());
        int i11 = RemoteActionCompatParcelizer;
        int i12 = i11 & 125;
        int i13 = (i11 | 125) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        read = i15 % 128;
        int i16 = i15 % 2;
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "initialization", str2}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        String str3 = (String) StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0}, -826629913, ai.write(), ai.write(), ai.write(), 826629918, ai.write());
        int i17 = RemoteActionCompatParcelizer + 53;
        read = i17 % 128;
        int i18 = i17 % 2;
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "initialization", str3}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        String str4 = (String) StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0}, 984337845, ai.write(), ai.write(), ai.write(), -984337839, ai.write());
        int i19 = read + 103;
        RemoteActionCompatParcelizer = i19 % 128;
        int i20 = i19 % 2;
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "startNumber", str4}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        StyledPlayerControlViewSettingViewHolder styledPlayerControlViewSettingViewHolder = (StyledPlayerControlViewSettingViewHolder) StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0}, -1921594879, ai.write(), ai.write(), ai.write(), 1921594882, ai.write());
        if (styledPlayerControlViewSettingViewHolder != null) {
            int i21 = RemoteActionCompatParcelizer;
            int i22 = i21 & 95;
            int i23 = (i21 | 95) & (~i22);
            int i24 = -(-(i22 << 1));
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            read = i25 % 128;
            int i26 = i25 % 2;
            int iAudioAttributesCompatParcelizer = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
            if (!((List) StyledPlayerControlViewSettingViewHolder.AudioAttributesCompatParcelizer(1561159178, new Object[]{styledPlayerControlViewSettingViewHolder}, WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1561159177)).isEmpty()) {
                int i27 = RemoteActionCompatParcelizer;
                int i28 = (-2) - ((((i27 | 38) << 1) - (i27 ^ 38)) ^ (-1));
                read = i28 % 128;
                if (i28 % 2 != 0) {
                    elementCreateElement.appendChild((Element) AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewSettingViewHolder, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 254040576, -254040570, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer()));
                    int i29 = 24 / 0;
                } else {
                    elementCreateElement.appendChild((Element) AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewSettingViewHolder, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 254040576, -254040570, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer()));
                }
            }
        }
        int i30 = read;
        int i31 = ((i30 | 11) << 1) - (i30 ^ 11);
        RemoteActionCompatParcelizer = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 42 / 0;
        }
        return elementCreateElement;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        notifyOnVisibilityChange notifyonvisibilitychange = (notifyOnVisibilityChange) objArr[0];
        Document document = (Document) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(notifyonvisibilitychange, "");
            toMagicModuleMetaRepoModel.write(document, "");
            int i3 = 77 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(notifyonvisibilitychange, "");
            toMagicModuleMetaRepoModel.write(document, "");
        }
        Element elementCreateElement = document.createElement("ms:laurl");
        int i4 = read;
        int i5 = i4 & 47;
        int i6 = -(-(i4 | 47));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        toMagicModuleMetaRepoModel.write(elementCreateElement);
        if (i8 == 0) {
            int iWrite = Identity.write();
            int iWrite2 = Identity.write();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iWrite3 = Identity.write();
        int iWrite4 = Identity.write();
        String str = (String) notifyOnVisibilityChange.read(Identity.write(), iWrite4, iWrite3, Identity.write(), new Object[]{notifyonvisibilitychange}, 713814684, -713814684);
        int i9 = read;
        int i10 = (((i9 ^ 19) | (i9 & 19)) << 1) - (((~i9) & 19) | (i9 & (-20)));
        RemoteActionCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "licenseUrl", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i12 = read;
        int i13 = i12 & 115;
        int i14 = ((i12 ^ 115) | i13) << 1;
        int i15 = -((i12 | 115) & (~i13));
        int i16 = (i14 & i15) + (i15 | i14);
        RemoteActionCompatParcelizer = i16 % 128;
        int i17 = i16 % 2;
        return elementCreateElement;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r29) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StyledPlayerControlViewAudioTrackSelectionAdapter.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        String str;
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        Document document = (Document) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 69;
        int i4 = ((i2 | 69) & (~i3)) + (i3 << 1);
        read = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter, "");
        toMagicModuleMetaRepoModel.write(document, "");
        int i6 = read;
        int i7 = ((i6 & (-10)) | ((~i6) & 9)) + ((i6 & 9) << 1);
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        Element elementCreateElement = document.createElement("Representation");
        toMagicModuleMetaRepoModel.write(elementCreateElement);
        int i9 = RemoteActionCompatParcelizer;
        int i10 = i9 ^ 37;
        int i11 = ((i9 & 37) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        read = i13 % 128;
        int i14 = i13 % 2;
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "id", (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer3, -1939427458, iRemoteActionCompatParcelizer, 1939427460)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i15 = read;
        int i16 = ((i15 & 125) - (~(-(-(i15 | 125))))) - 1;
        RemoteActionCompatParcelizer = i16 % 128;
        if (i16 % 2 == 0) {
            int iRemoteActionCompatParcelizer4 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer5 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer6 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "bandwidth", (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer5, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer6, -1083521343, iRemoteActionCompatParcelizer4, 1083521350)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int iRemoteActionCompatParcelizer7 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer8 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer9 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            str = (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer8, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer9, -818269708, iRemoteActionCompatParcelizer7, 818269708);
            int i17 = 4 / 0;
        } else {
            int iRemoteActionCompatParcelizer10 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer11 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer12 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "bandwidth", (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer11, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer12, -1083521343, iRemoteActionCompatParcelizer10, 1083521350)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int iRemoteActionCompatParcelizer13 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer14 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer15 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            str = (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer14, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer15, -818269708, iRemoteActionCompatParcelizer13, 818269708);
        }
        int i18 = RemoteActionCompatParcelizer + 7;
        read = i18 % 128;
        Object obj = null;
        if (i18 % 2 != 0) {
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "codecs", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int iRemoteActionCompatParcelizer16 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer17 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer18 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "width", (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer17, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer18, -194583858, iRemoteActionCompatParcelizer16, 194583864)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            throw null;
        }
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "codecs", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int iRemoteActionCompatParcelizer19 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer20 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer21 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "width", (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer20, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer21, -194583858, iRemoteActionCompatParcelizer19, 194583864)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int iRemoteActionCompatParcelizer22 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer23 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer24 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "height", (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer23, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer24, -706132044, iRemoteActionCompatParcelizer22, 706132048)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int iRemoteActionCompatParcelizer25 = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
        int i19 = ((~iRemoteActionCompatParcelizer25) & 933221102) | ((-933221103) & iRemoteActionCompatParcelizer25);
        int i20 = 933221102 & iRemoteActionCompatParcelizer25;
        int i21 = (i19 & i20) | (i19 ^ i20);
        int i22 = -(-(((i21 | (~i21)) & (~i21)) * 521));
        int i23 = (-1545358940) ^ i22;
        int i24 = (((i22 & (-1545358940)) | i23) << 1) - i23;
        int i25 = i24 & (-708129864);
        int i26 = (i25 - (~(-(-((i24 ^ (-708129864)) | i25))))) - 1;
        int i27 = ~iRemoteActionCompatParcelizer25;
        int i28 = 915325676 ^ i27;
        int i29 = i27 & 915325676;
        int i30 = (i29 & i28) | (i28 ^ i29);
        int i31 = (i30 & 286495238) | ((-286495239) & i30) | ((~i30) & 286495238);
        int i32 = (i31 | (~i31)) & (~i31);
        int i33 = (-2) - ((i26 - (~(((i32 & 268599812) | (((~i32) & 268599812) | ((-268599813) & i32))) * 521))) ^ (-1));
        int iRemoteActionCompatParcelizer26 = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
        int i34 = ((-402671653) & iRemoteActionCompatParcelizer26) | ((-402671653) ^ iRemoteActionCompatParcelizer26);
        int i35 = (i34 | (~i34)) & (~i34);
        int i36 = ~iRemoteActionCompatParcelizer26;
        int i37 = (i36 & (-1197713369)) | (i36 ^ (-1197713369));
        int i38 = i37 ^ 1480682620;
        int i39 = i37 & 1480682620;
        int i40 = (i39 & i38) | (i38 ^ i39);
        int i41 = (i40 | (~i40)) & (~i40);
        int i42 = -(-(((i35 & i41) | (i35 ^ i41)) * (-318)));
        int i43 = 1609369145 ^ i42;
        int i44 = (((i42 & 1609369145) | i43) << 1) - i43;
        int i45 = (-1197713369) ^ iRemoteActionCompatParcelizer26;
        int i46 = (-1197713369) & iRemoteActionCompatParcelizer26;
        int i47 = ~((i45 & i46) | (i45 ^ i46));
        int i48 = 1078010968 & i47;
        int i49 = (i47 | 1078010968) & (~i48);
        int i50 = (i44 - (~(((i49 & i48) | (i49 ^ i48)) * (-318)))) - 1;
        int i51 = 1197713368 ^ iRemoteActionCompatParcelizer26;
        int i52 = iRemoteActionCompatParcelizer26 & 1197713368;
        int i53 = ~((i52 & i51) | (i51 ^ i52));
        int i54 = (-1480682621) ^ i53;
        int i55 = i53 & (-1480682621);
        int i56 = -(-(((i55 & i54) | (i54 ^ i55)) * 318));
        if (i33 > (i50 ^ i56) + ((i56 & i50) << 1)) {
            int iRemoteActionCompatParcelizer27 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer28 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer29 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "audioSamplingRate", (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer28, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer29, -76570058, iRemoteActionCompatParcelizer27, 76570061)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            throw null;
        }
        int iRemoteActionCompatParcelizer30 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer31 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer32 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "audioSamplingRate", (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer31, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer32, -76570058, iRemoteActionCompatParcelizer30, 76570061)}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        if (str2 != null && TestGroupLSModel.write((CharSequence) str2, (CharSequence) "vtt", false)) {
            int i57 = read;
            int i58 = i57 & 81;
            int i59 = (i57 | 81) & (~i58);
            int i60 = i58 << 1;
            int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
            RemoteActionCompatParcelizer = i61 % 128;
            int i62 = i61 % 2;
            int iRemoteActionCompatParcelizer33 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer34 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer35 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            String str3 = (String) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer34, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer35, 228726344, iRemoteActionCompatParcelizer33, -228726335);
            int i63 = RemoteActionCompatParcelizer;
            int i64 = ((i63 & (-2)) | ((~i63) & 1)) + ((i63 & 1) << 1);
            read = i64 % 128;
            if (i64 % 2 != 0) {
                AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, document, "BaseURL", str3}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 741721738, -741721728, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
                obj.hashCode();
                throw null;
            }
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, document, "BaseURL", str3}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 741721738, -741721728, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        }
        int iRemoteActionCompatParcelizer36 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer37 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer38 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = (StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0) lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer37, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter}, iRemoteActionCompatParcelizer38, -2021133927, iRemoteActionCompatParcelizer36, 2021133928);
        if (styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 != null) {
            int i65 = read;
            int i66 = (i65 ^ 7) + ((i65 & 7) << 1);
            RemoteActionCompatParcelizer = i66 % 128;
            int i67 = i66 % 2;
            elementCreateElement.appendChild((Element) AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1410902782, 1410902784, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer()));
            int i68 = RemoteActionCompatParcelizer + 55;
            read = i68 % 128;
            int i69 = i68 % 2;
        }
        int i70 = RemoteActionCompatParcelizer;
        int i71 = ((i70 ^ 125) | (i70 & 125)) << 1;
        int i72 = -(((~i70) & 125) | (i70 & (-126)));
        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
        read = i73 % 128;
        int i74 = i73 % 2;
        return elementCreateElement;
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        Iterator it;
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        Document document = (Document) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 49;
        int i4 = (i3 - (~((i2 ^ 49) | i3))) - 1;
        read = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(updatetracklists, "");
        toMagicModuleMetaRepoModel.write(document, "");
        Element elementCreateElement = document.createElement("AdaptationSet");
        toMagicModuleMetaRepoModel.write(elementCreateElement);
        int i6 = read;
        int i7 = i6 & 57;
        int i8 = (((i6 ^ 57) | i7) << 1) - ((i6 | 57) & (~i7));
        RemoteActionCompatParcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "id", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), -761041284, 761041291, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "group", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1294839498, -1294839483, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int i9 = 99 / 0;
        } else {
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "id", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), -761041284, 761041291, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "group", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1294839498, -1294839483, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        }
        int i10 = read;
        int i11 = (i10 ^ 23) + ((i10 & 23) << 1);
        RemoteActionCompatParcelizer = i11 % 128;
        if (i11 % 2 == 0) {
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "profiles", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1668646586, -1668646586, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "bitstreamSwitching", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1895510063, -1895510060, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            throw null;
        }
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "profiles", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1668646586, -1668646586, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "bitstreamSwitching", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1895510063, -1895510060, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        String str = (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), -190193358, 190193360, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read());
        int i12 = RemoteActionCompatParcelizer;
        int i13 = ((((i12 ^ 9) | (i12 & 9)) << 1) - (~(-(((~i12) & 9) | (i12 & (-10)))))) - 1;
        read = i13 % 128;
        int i14 = i13 % 2;
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "segmentAlignment", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "contentType", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 706335075, -706335062, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "mimeType", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1533914961, -1533914957, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i15 = read;
        int i16 = ((((i15 ^ 25) | (i15 & 25)) << 1) - (~(-(((~i15) & 25) | (i15 & (-26)))))) - 1;
        RemoteActionCompatParcelizer = i16 % 128;
        int i17 = i16 % 2;
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "bitstreamSwitching", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1895510063, -1895510060, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "mimeType", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1533914961, -1533914957, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i18 = RemoteActionCompatParcelizer;
        int i19 = i18 & 47;
        int i20 = (((i18 | 47) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
        read = i20 % 128;
        if (i20 % 2 != 0) {
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "codecs", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), -36277101, 36277117, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "maxWidth", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), -425082617, 425082629, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "codecs", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), -36277101, 36277117, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "maxWidth", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), -425082617, 425082629, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "maxHeight", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 475165900, -475165890, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "startWithSAP", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1143315317, -1143315300, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "lang", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 2108714477, -2108714469, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i21 = RemoteActionCompatParcelizer;
        int i22 = (i21 & (-18)) | ((~i21) & 17);
        int i23 = (i21 & 17) << 1;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        read = i24 % 128;
        if (i24 % 2 != 0) {
            it = ((List) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 2044895185, -2044895179, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())).iterator();
            int i25 = 62 / 0;
        } else {
            it = ((List) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 2044895185, -2044895179, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())).iterator();
        }
        while (it.hasNext()) {
            int i26 = read;
            int i27 = (((i26 | 56) << 1) - (i26 ^ 56)) - 1;
            RemoteActionCompatParcelizer = i27 % 128;
            if (i27 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            elementCreateElement.appendChild((Element) AudioAttributesCompatParcelizer(new Object[]{(StyledPlayerControlViewExternalSyntheticLambda0) it.next(), document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -247777372, 247777375, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer()));
            int iRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
            int i28 = (-503448084) ^ iRemoteActionCompatParcelizer;
            int i29 = (-503448084) & iRemoteActionCompatParcelizer;
            int i30 = ~((i28 & i29) | (i28 ^ i29));
            int i31 = ((i30 & 1056040) | (1056040 ^ i30)) * (-476);
            int i32 = (815200847 & i31) + (i31 | 815200847);
            int i33 = ~iRemoteActionCompatParcelizer;
            int i34 = ((-503448084) & i33) | (503448083 & iRemoteActionCompatParcelizer);
            int i35 = iRemoteActionCompatParcelizer & (-503448084);
            int i36 = -(-((~((i35 & i34) | (i34 ^ i35))) * 952));
            int i37 = i32 & i36;
            int i38 = ((i36 | i32) & (~i37)) + (i37 << 1);
            int i39 = (-2116502040) ^ i33;
            int i40 = (-2116502040) & i33;
            int i41 = (i40 & i39) | (i39 ^ i40);
            int i42 = i41 ^ 1614109996;
            int i43 = i41 & 1614109996;
            int i44 = -(-((~((i43 & i42) | (i42 ^ i43))) * 476));
            int i45 = i38 & i44;
            int i46 = (((i38 ^ i44) | i45) << 1) - ((i38 | i44) & (~i45));
            int iRemoteActionCompatParcelizer2 = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
            int i47 = ~iRemoteActionCompatParcelizer2;
            int i48 = (i47 & (-1682734769)) | ((~i47) & 1682734768);
            int i49 = i47 & 1682734768;
            int i50 = (i48 & i49) | (i48 ^ i49);
            int i51 = (i50 | (~i50)) & (~i50);
            int i52 = ((~i51) & 36816516) | (i51 & (-36816517));
            int i53 = i51 & 36816516;
            int i54 = ((i52 ^ i53) | (i53 & i52)) * (-328);
            int i55 = (-1923069692) & i54;
            int i56 = (i55 - (~((i54 ^ (-1923069692)) | i55))) - 1;
            int i57 = ((36816516 & i47) | (iRemoteActionCompatParcelizer2 & (-36816517)) | (36816516 & iRemoteActionCompatParcelizer2)) * 164;
            int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
            int i59 = (i47 & (-1682734769)) | (iRemoteActionCompatParcelizer2 & 1682734768);
            int i60 = (-1682734769) & iRemoteActionCompatParcelizer2;
            int i61 = ~((i59 & i60) | (i59 ^ i60));
            int i62 = (i61 & 18048) | (i61 & (-18049)) | ((~i61) & 18048);
            int i63 = ~iRemoteActionCompatParcelizer2;
            int i64 = (i63 & 36816516) | (i63 ^ 36816516);
            int i65 = ~((i64 & 1682734768) | (i64 ^ 1682734768));
            int i66 = i62 ^ i65;
            int i67 = i65 & i62;
            int i68 = -(-(((i67 & i66) | (i66 ^ i67)) * 164));
            int i69 = i58 & i68;
            int i70 = (i68 | i58) & (~i69);
            int i71 = i69 << 1;
            if (i46 > (i70 ^ i71) + ((i70 & i71) << 1)) {
                int i72 = 97 / 0;
            }
            int i73 = (-2) - ((read + 62) ^ (-1));
            RemoteActionCompatParcelizer = i73 % 128;
            int i74 = i73 % 2;
        }
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, document, "Label", (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 280463891, -280463882, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 741721738, -741721728, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = (StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 2108213751, -2108213740, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read());
        int i75 = RemoteActionCompatParcelizer + 33;
        int i76 = i75 % 128;
        read = i76;
        int i77 = i75 % 2;
        if (styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 != null) {
            int i78 = i76 + 81;
            RemoteActionCompatParcelizer = i78 % 128;
            if (i78 % 2 == 0) {
                elementCreateElement.appendChild((Element) AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1410902782, 1410902784, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer()));
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            elementCreateElement.appendChild((Element) AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1410902782, 1410902784, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer()));
        }
        int i79 = RemoteActionCompatParcelizer;
        int i80 = ((i79 ^ 66) + ((i79 & 66) << 1)) - 1;
        read = i80 % 128;
        int i81 = i80 % 2;
        int i82 = (i79 ^ 124) + ((i79 & 124) << 1);
        int i83 = (i82 ^ (-1)) + (i82 << 1);
        read = i83 % 128;
        int i84 = i83 % 2;
        for (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter : (List) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), -630250661, 630250662, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())) {
            int i85 = RemoteActionCompatParcelizer;
            int i86 = ((i85 & 8) + (i85 | 8)) - 1;
            read = i86 % 128;
            int i87 = i86 % 2;
            int i88 = RemoteActionCompatParcelizer + 65;
            read = i88 % 128;
            int i89 = i88 % 2;
            elementCreateElement.appendChild((Element) AudioAttributesCompatParcelizer(new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter, document, (String) updateTrackLists.IconCompatParcelizer(RtpDataLoadable.read(), RtpDataLoadable.read(), 1533914961, -1533914957, new Object[]{updatetracklists}, RtpDataLoadable.read(), RtpDataLoadable.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 269496002, -269495993, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer()));
            int i90 = (-2) - ((RemoteActionCompatParcelizer + 10) ^ (-1));
            read = i90 % 128;
            if (i90 % 2 != 0) {
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }
        int i91 = read;
        int i92 = (i91 & (-74)) | ((~i91) & 73);
        int i93 = (i91 & 73) << 1;
        int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
        RemoteActionCompatParcelizer = i94 % 128;
        int i95 = i94 % 2;
        return elementCreateElement;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        updateSelectedIndex updateselectedindex = (updateSelectedIndex) objArr[0];
        Document document = (Document) objArr[1];
        int i = 2 % 2;
        int i2 = (-2) - ((read + 20) ^ (-1));
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(updateselectedindex, "");
        toMagicModuleMetaRepoModel.write(document, "");
        int i4 = read;
        int i5 = i4 & 5;
        int i6 = ((i4 ^ 5) | i5) << 1;
        int i7 = -((i4 | 5) & (~i5));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        RemoteActionCompatParcelizer = i8 % 128;
        int i9 = i8 % 2;
        Element elementCreateElement = document.createElement("Period");
        int iRemoteActionCompatParcelizer = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        List list = (List) updateSelectedIndex.write(-1215621208, selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer(), 1215621208, selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer(), new Object[]{updateselectedindex});
        int i10 = read + 39;
        RemoteActionCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        Iterator it = list.iterator();
        int i12 = RemoteActionCompatParcelizer;
        int i13 = ((i12 ^ 118) + ((i12 & 118) << 1)) - 1;
        read = i13 % 128;
        int i14 = i13 % 2;
        while (it.hasNext()) {
            int i15 = RemoteActionCompatParcelizer;
            int i16 = i15 & 83;
            int i17 = i15 | 83;
            int i18 = (i16 & i17) + (i17 | i16);
            read = i18 % 128;
            Object obj = null;
            if (i18 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Element element = (Element) AudioAttributesCompatParcelizer(new Object[]{(updateTrackLists) it.next(), document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 1739563170, -1739563158, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int i19 = read;
            int i20 = ((i19 ^ 68) + ((i19 & 68) << 1)) - 1;
            RemoteActionCompatParcelizer = i20 % 128;
            if (i20 % 2 == 0) {
                elementCreateElement.appendChild(element);
                throw null;
            }
            elementCreateElement.appendChild(element);
        }
        toMagicModuleMetaRepoModel.write(elementCreateElement);
        int i21 = RemoteActionCompatParcelizer;
        int i22 = (i21 & 61) + (i21 | 61);
        read = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 14 / 0;
        }
        return elementCreateElement;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        Document document = (Document) objArr[1];
        int i = 2 % 2;
        int i2 = (-2) - ((RemoteActionCompatParcelizer + 112) ^ (-1));
        read = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(isfullyvisible, "");
        toMagicModuleMetaRepoModel.write(document, "");
        Element elementCreateElement = document.createElement("MPD");
        int i4 = read + 15;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(elementCreateElement);
            int i5 = getHasMultipleThemes.read();
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "xmlns", (String) isFullyVisible.write(1124611137, -1124611131, getHasMultipleThemes.read(), i5, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int i6 = 40 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(elementCreateElement);
            int i7 = getHasMultipleThemes.read();
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "xmlns", (String) isFullyVisible.write(1124611137, -1124611131, getHasMultipleThemes.read(), i7, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        }
        int i8 = read + 103;
        RemoteActionCompatParcelizer = i8 % 128;
        int i9 = i8 % 2;
        int i10 = getHasMultipleThemes.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "xmlns:xsi", (String) isFullyVisible.write(-427768901, 427768908, getHasMultipleThemes.read(), i10, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i11 = getHasMultipleThemes.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "profiles", (String) isFullyVisible.write(-899762990, 899762991, getHasMultipleThemes.read(), i11, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i12 = read + 113;
        RemoteActionCompatParcelizer = i12 % 128;
        int i13 = i12 % 2;
        int i14 = getHasMultipleThemes.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "type", (String) isFullyVisible.write(1741567785, -1741567781, getHasMultipleThemes.read(), i14, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i15 = getHasMultipleThemes.read();
        String str = (String) isFullyVisible.write(1791917002, -1791916994, getHasMultipleThemes.read(), i15, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read());
        int i16 = read;
        int i17 = i16 & 59;
        int i18 = -(-((i16 ^ 59) | i17));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        RemoteActionCompatParcelizer = i19 % 128;
        Object obj = null;
        if (i19 % 2 == 0) {
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "xmlns:cenc", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int i20 = getHasMultipleThemes.read();
            AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "xmlns:mspr", (String) isFullyVisible.write(-108197224, 108197235, getHasMultipleThemes.read(), i20, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            throw null;
        }
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "xmlns:cenc", str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i21 = getHasMultipleThemes.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "xmlns:mspr", (String) isFullyVisible.write(-108197224, 108197235, getHasMultipleThemes.read(), i21, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i22 = RemoteActionCompatParcelizer;
        int i23 = i22 & 71;
        int i24 = (i22 | 71) & (~i23);
        int i25 = i23 << 1;
        int i26 = (i24 & i25) + (i24 | i25);
        read = i26 % 128;
        int i27 = i26 % 2;
        int i28 = getHasMultipleThemes.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "xmlns:ms", (String) isFullyVisible.write(934738568, -934738568, getHasMultipleThemes.read(), i28, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i29 = getHasMultipleThemes.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "mediaPresentationDuration", (String) isFullyVisible.write(-2017376204, 2017376214, getHasMultipleThemes.read(), i29, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i30 = read;
        int i31 = i30 ^ 89;
        int i32 = ((i30 & 89) | i31) << 1;
        int i33 = -i31;
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        RemoteActionCompatParcelizer = i34 % 128;
        int i35 = i34 % 2;
        int i36 = getHasMultipleThemes.read();
        AudioAttributesCompatParcelizer(new Object[]{elementCreateElement, "minBufferTime", (String) isFullyVisible.write(-1870742996, 1870743001, getHasMultipleThemes.read(), i36, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read())}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i37 = getHasMultipleThemes.read();
        List list = (List) isFullyVisible.write(-1390053422, 1390053424, getHasMultipleThemes.read(), i37, getHasMultipleThemes.read(), new Object[]{isfullyvisible}, getHasMultipleThemes.read());
        int i38 = RemoteActionCompatParcelizer;
        int i39 = ((i38 | 79) << 1) - (i38 ^ 79);
        read = i39 % 128;
        int i40 = i39 % 2;
        Iterator it = list.iterator();
        int i41 = read + 41;
        RemoteActionCompatParcelizer = i41 % 128;
        int i42 = i41 % 2;
        while (it.hasNext()) {
            int i43 = read;
            int i44 = (((i43 | 116) << 1) - (i43 ^ 116)) - 1;
            RemoteActionCompatParcelizer = i44 % 128;
            if (i44 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Element element = (Element) AudioAttributesCompatParcelizer(new Object[]{(updateSelectedIndex) it.next(), document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 565740578, -565740570, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
            int i45 = RemoteActionCompatParcelizer;
            int i46 = i45 & 81;
            int i47 = (i45 ^ 81) | i46;
            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
            read = i48 % 128;
            int i49 = i48 % 2;
            elementCreateElement.appendChild(element);
            int i50 = RemoteActionCompatParcelizer;
            int i51 = (((i50 | 112) << 1) - (i50 ^ 112)) - 1;
            read = i51 % 128;
            int i52 = i51 % 2;
        }
        int i53 = read + 45;
        RemoteActionCompatParcelizer = i53 % 128;
        int i54 = i53 % 2;
        return elementCreateElement;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        setDownloadingStatesToQueued setdownloadingstatestoqueued = new setDownloadingStatesToQueued();
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 13;
        int i4 = -(-((i2 ^ 13) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        read = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            DocumentBuilderFactory.newInstance();
            obj.hashCode();
            throw null;
        }
        hideImmediately hideimmediately = (hideImmediately) setdownloadingstatestoqueued.IconCompatParcelizer(str, hideImmediately.class);
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        int i6 = read;
        int i7 = ((i6 | 107) << 1) - (i6 ^ 107);
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        isFullyVisible isfullyvisible = (isFullyVisible) hideImmediately.read(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 23305950, maybeInvalidateForRendererCapabilitiesChange.write(), -23305950, new Object[]{hideimmediately}, iWrite);
        int i9 = read;
        int i10 = i9 & 31;
        int i11 = i10 + ((i9 ^ 31) | i10);
        RemoteActionCompatParcelizer = i11 % 128;
        if (i11 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(documentNewDocument);
            throw null;
        }
        toMagicModuleMetaRepoModel.write(documentNewDocument);
        Element element = (Element) AudioAttributesCompatParcelizer(new Object[]{isfullyvisible, documentNewDocument}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -921024916, 921024927, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        int i12 = RemoteActionCompatParcelizer;
        int i13 = ((i12 | 57) << 1) - (i12 ^ 57);
        read = i13 % 128;
        if (i13 % 2 != 0) {
            documentNewDocument.appendChild(element);
            obj.hashCode();
            throw null;
        }
        documentNewDocument.appendChild(element);
        int i14 = RemoteActionCompatParcelizer + 23;
        read = i14 % 128;
        int i15 = i14 % 2;
        String str2 = (String) AudioAttributesCompatParcelizer(new Object[]{documentNewDocument}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1766203918, 1766203919, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
        if (str2 == null) {
            int i16 = RemoteActionCompatParcelizer;
            int i17 = ((i16 & 67) - (~(-(-(i16 | 67))))) - 1;
            read = i17 % 128;
            int i18 = i17 % 2;
            DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
            DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
            str2 = "NA";
        }
        int i19 = read + 107;
        RemoteActionCompatParcelizer = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 36 / 0;
        }
        return str2;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        String string;
        Document document = (Document) objArr[0];
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(document, "");
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            int i2 = read;
            int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(transformerNewTransformer, "");
            int i5 = RemoteActionCompatParcelizer;
            int i6 = (-2) - (((i5 ^ 66) + ((i5 & 66) << 1)) ^ (-1));
            read = i6 % 128;
            if (i6 % 2 != 0) {
                transformerNewTransformer.transform(dOMSource, streamResult);
                string = stringWriter.toString();
                int i7 = 37 / 0;
            } else {
                transformerNewTransformer.transform(dOMSource, streamResult);
                string = stringWriter.toString();
            }
            int i8 = read;
            int i9 = i8 & 37;
            int i10 = -(-(i8 | 37));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            RemoteActionCompatParcelizer = i11 % 128;
            int i12 = i11 % 2;
            return string;
        } catch (TransformerException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void read(Element element, Document document, String str, String str2) {
        AudioAttributesCompatParcelizer(new Object[]{element, document, str, str2}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 741721738, -741721728, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static String AudioAttributesCompatParcelizer(Document document) {
        return (String) AudioAttributesCompatParcelizer(new Object[]{document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1766203918, 1766203919, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    public static final String RemoteActionCompatParcelizer(String str) {
        return (String) AudioAttributesCompatParcelizer(new Object[]{str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1998611802, 1998611802, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static void RemoteActionCompatParcelizer(Element element, String str, String str2) {
        AudioAttributesCompatParcelizer(new Object[]{element, str, str2}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1167194570, 1167194577, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element IconCompatParcelizer(updateTrackLists updatetracklists, Document document) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{updatetracklists, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 1739563170, -1739563158, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element read(StyledPlayerControlViewExternalSyntheticLambda0 styledPlayerControlViewExternalSyntheticLambda0, Document document) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewExternalSyntheticLambda0, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -247777372, 247777375, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element read(notifyOnVisibilityChange notifyonvisibilitychange, Document document) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{notifyonvisibilitychange, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 1070978700, -1070978695, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element AudioAttributesCompatParcelizer(isFullyVisible isfullyvisible, Document document) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{isfullyvisible, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -921024916, 921024927, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element RemoteActionCompatParcelizer(updateSelectedIndex updateselectedindex, Document document) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{updateselectedindex, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 565740578, -565740570, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element RemoteActionCompatParcelizer(lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter, Document document, String str) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter, document, str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 269496002, -269495993, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element RemoteActionCompatParcelizer(onFullScreenModeChanged onfullscreenmodechanged, Document document) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{onfullscreenmodechanged, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1143365091, 1143365095, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element RemoteActionCompatParcelizer(StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, Document document) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1410902782, 1410902784, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }

    private static Element read(StyledPlayerControlViewSettingViewHolder styledPlayerControlViewSettingViewHolder, Document document) {
        return (Element) AudioAttributesCompatParcelizer(new Object[]{styledPlayerControlViewSettingViewHolder, document}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 254040576, -254040570, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer());
    }
}
