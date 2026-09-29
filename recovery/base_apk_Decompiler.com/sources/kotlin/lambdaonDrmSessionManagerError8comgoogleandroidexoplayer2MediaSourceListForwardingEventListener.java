package kotlin;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener AudioAttributesCompatParcelizer;
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener AudioAttributesImplApi21Parcelizer;
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener AudioAttributesImplApi26Parcelizer;
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener AudioAttributesImplBaseParcelizer;
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener IconCompatParcelizer;
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener MediaBrowserCompatCustomActionResultReceiver;
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener MediaBrowserCompatItemReceiver;
    private static LinkedHashMap<lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener, lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener> MediaBrowserCompatMediaItem = new LinkedHashMap<>();
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener RemoteActionCompatParcelizer;
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener read;
    public static final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener write;

    static {
        lambdaonDownstreamFormatChanged5comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener = lambdaonDownstreamFormatChanged5comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.BINARY;
        AudioAttributesCompatParcelizer = new onDrmKeysRemoved("4f", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "Application Identifier (AID) - card", "Identifies the application as described in ISO/IEC 7816-5");
        write = new onDrmKeysRemoved("84", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "Dedicated File (DF) Name", "Identifies the name of the DF as described in ISO/IEC 7816-4");
        AudioAttributesImplApi26Parcelizer = new onDrmKeysRemoved("57", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "Track 2 Equivalent Data", "Contains the data elements of track 2 according to ISO/IEC 7813, excluding start sentinel, end sentinel, and Longitudinal Redundancy Check (LRC)");
        MediaBrowserCompatCustomActionResultReceiver = new onDrmKeysRemoved("80", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "Response Message Template Format 1", "Contains the data objects (without tags and lengths) returned by the ICC in response to a command");
        RemoteActionCompatParcelizer = new onDrmKeysRemoved("83", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "Command Template", "Identifies the data field of a command message");
        IconCompatParcelizer = new onDrmKeysRemoved("94", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "Application File Locator (AFL)", "Indicates the location (SFI, range of records) of the AEFs related to a given application");
        MediaBrowserCompatItemReceiver = new onDrmKeysRemoved("9f38", lambdaonDownstreamFormatChanged5comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.DOL, "Processing Options Data Object List (PDOL)", "Contains a list of terminal resident data objects (tags and lengths) needed by the ICC in processing the GET PROCESSING OPTIONS command");
        AudioAttributesImplBaseParcelizer = new onDrmKeysRemoved("9f66", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "Terminal Transaction Qualifiers", "Provided by the reader in the GPO command and used by the card to determine processing choices based on reader functionality");
        AudioAttributesImplApi21Parcelizer = new onDrmKeysRemoved("9f6b", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "Track 2 Data", "Track 2 Data contains the data objects of the track 2 according to [ISO/IEC 7813] Structure B, excluding start sentinel, end sentinel and LRC.");
        read = new onDrmKeysRemoved("9f2a", lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, "The value to be appended to the ADF Name in the data field of the SELECT command, if the Extended Selection Support flag is present and set to 1", "");
    }

    public static void write() {
        IconCompatParcelizer(AudioAttributesCompatParcelizer);
        IconCompatParcelizer(write);
        IconCompatParcelizer(AudioAttributesImplApi26Parcelizer);
        IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver);
        IconCompatParcelizer(RemoteActionCompatParcelizer);
        IconCompatParcelizer(IconCompatParcelizer);
        IconCompatParcelizer(MediaBrowserCompatItemReceiver);
        IconCompatParcelizer(AudioAttributesImplBaseParcelizer);
        IconCompatParcelizer(AudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer(read);
    }

    public static lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener IconCompatParcelizer(byte[] bArr) {
        lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener = read(bArr);
        return lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener == null ? write(bArr) : lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener;
    }

    private static lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener write(byte[] bArr) {
        return new onDrmKeysRemoved(bArr, lambdaonDownstreamFormatChanged5comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.BINARY, "[UNKNOWN TAG]", "");
    }

    private static lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener read(byte[] bArr) {
        return MediaBrowserCompatMediaItem.get(lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.read(bArr));
    }

    private static void IconCompatParcelizer(lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener) {
        MediaBrowserCompatMediaItem.put(lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.read(lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener.RemoteActionCompatParcelizer()), lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener);
    }
}
