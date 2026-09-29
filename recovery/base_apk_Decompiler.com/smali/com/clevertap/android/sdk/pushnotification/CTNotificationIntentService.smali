###### Class com.clevertap.android.sdk.pushnotification.CTNotificationIntentService (com.clevertap.android.sdk.pushnotification.CTNotificationIntentService)
.class public Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;
.super Landroid/app/IntentService;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
    since = "4.3.0"
.end annotation


# static fields
.field private static final $$a:[B

.field private static final $$b:I

.field private static final $$c:[B

.field private static final $$d:[B

.field private static final $$e:I

.field private static final $$f:I

.field private static $10:I = 0x0

.field private static $11:I = 0x0

.field private static AudioAttributesCompatParcelizer:C = '\u0000'

.field private static IconCompatParcelizer:I = 0x0

.field public static final MAIN_ACTION:Ljava/lang/String; = "com.clevertap.PUSH_EVENT"

.field private static MediaBrowserCompatItemReceiver:I = 0x0

.field private static RemoteActionCompatParcelizer:I = 0x0

.field public static final TYPE_BUTTON_CLICK:Ljava/lang/String; = "com.clevertap.ACTION_BUTTON_CLICK"

.field private static read:J

.field private static write:J


# instance fields
.field private mActionButtonClickHandler:Lo/setAdPositionMs;


# direct methods
.method private static $$g(BBB)Ljava/lang/String;
    .registers 8

    sget-object v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$c:[B

    add-int/lit8 p0, p0, 0x4

    mul-int/lit8 p1, p1, 0x4

    rsub-int/lit8 p1, p1, 0x1

    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, 0x67

    new-array v1, p1, [B

    const/4 v2, 0x0

    if-nez v0, :cond_14

    move v4, p1

    move v3, v2

    goto :goto_26

    :cond_14
    move v3, v2

    :goto_15
    int-to-byte v4, p2

    aput-byte v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 p0, p0, 0x1

    if-ne v3, p1, :cond_24

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BI)V

    return-object p0

    :cond_24
    aget-byte v4, v0, p0

    :goto_26
    neg-int v4, v4

    add-int/2addr p2, v4

    goto :goto_15
.end method

.method static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_48

    sput-object v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$c:[B

    const/16 v0, 0x6d

    sput v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$f:I

    const/4 v0, 0x0

    sput v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$10:I

    const/4 v1, 0x1

    sput v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$11:I

    const/16 v2, 0x28

    new-array v2, v2, [B

    fill-array-data v2, :array_4e

    sput-object v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$d:[B

    const/16 v2, 0xa1

    sput v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$e:I

    const/16 v2, 0xdd

    new-array v2, v2, [B

    fill-array-data v2, :array_66

    sput-object v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v2, 0xd1

    sput v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$b:I

    .line 783
    sput v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    sput v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    const-wide v0, 0x5340bff45c55fcdaL    # 1.0918397063137309E93

    sput-wide v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->write:J

    const-wide v0, -0x308e19fa082a2adcL    # -5.059834025732698E74

    sput-wide v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->read:J

    const v0, -0x82a2adc

    sput v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->RemoteActionCompatParcelizer:I

    const/16 v0, 0xeb0

    sput-char v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->AudioAttributesCompatParcelizer:C

    return-void

    :array_48
    .array-data 1
        0x32t
        -0x39t
        0x8t
        -0xet
    .end array-data

    :array_4e
    .array-data 1
        0x6dt
        -0x2at
        -0x63t
        -0x27t
        0xet
        0x3t
        -0x3t
        0x0t
        -0x14t
        -0x29t
        0x1dt
        0xct
        -0x10t
        0x1t
        -0x6t
        -0x30t
        0x27t
        -0x7t
        -0x2t
        -0x14t
        0xet
        -0x29t
        0xct
        0xct
        -0x14t
        -0x3t
        0x2t
        -0x8t
        0xct
        -0x1at
        0x8t
        -0x46t
        0x47t
        -0x5t
        -0x1bt
        0x7t
        -0xat
        -0xet
        0x6t
        -0x14t
    .end array-data

    :array_66
    .array-data 1
        0x37t
        -0x5et
        -0x3t
        -0x7at
        -0xct
        -0x3t
        0x4t
        0x19t
        0x0t
        0x6t
        -0x7t
        -0x1et
        0x31t
        -0x2t
        0x9t
        -0x3t
        -0xdt
        0xet
        -0x2et
        0x2dt
        -0x1t
        0x4t
        -0xet
        0x14t
        -0x2at
        0x2ct
        -0xet
        0x9t
        -0x1at
        0x14t
        -0x1t
        0x3t
        0x5t
        0xet
        -0x10t
        0xet
        0x1bt
        0xdt
        0x0t
        -0x2at
        0x2dt
        -0x1t
        0x4t
        -0xet
        0x14t
        -0x23t
        0x12t
        0x12t
        -0xet
        0x3t
        0x8t
        -0x2t
        0x12t
        -0x14t
        0xet
        0x14t
        0x9t
        0x3t
        0x6t
        -0xet
        -0x23t
        0x23t
        0x12t
        -0xat
        0x7t
        0x0t
        -0x2at
        0x2dt
        -0x1t
        0x4t
        -0xet
        0x14t
        -0x23t
        0x12t
        0x12t
        -0xet
        0x3t
        0x8t
        -0x2t
        0x12t
        -0x14t
        0xet
        0x19t
        0x0t
        0x6t
        -0x7t
        -0x1et
        0x31t
        -0x2t
        0x9t
        -0x3t
        -0xdt
        0xet
        -0x2et
        0x2dt
        -0x1t
        0x4t
        -0xet
        0x14t
        -0x30t
        0x33t
        -0x1t
        0x2t
        -0x4t
        -0x1t
        -0x2bt
        0x23t
        0x12t
        -0xat
        0x7t
        0x0t
        -0x1bt
        0x14t
        0xft
        0x3t
        -0x8t
        0x9t
        -0x21t
        0x14t
        -0x1t
        0x3t
        0x5t
        0xet
        -0x10t
        0xet
        0x35t
        -0x10t
        0x6t
        0x7t
        -0x2dt
        0x34t
        0x1t
        -0x1t
        -0x8t
        -0x6t
        0x14t
        0x0t
        -0xet
        0xft
        -0x29t
        0x25t
        0x4t
        -0x3t
        -0x2at
        0x30t
        -0x6t
        -0x36t
        0x0t
        0x20t
        0x12t
        0x12t
        -0xet
        0x3t
        0x8t
        -0x2t
        0x12t
        -0x14t
        0xet
        0x35t
        -0x10t
        0x6t
        0x7t
        -0x2dt
        0x34t
        0x1t
        -0x1t
        -0x8t
        -0x6t
        0x14t
        0x0t
        -0xet
        0xft
        -0x29t
        0x25t
        0x4t
        -0x3t
        -0x2at
        0x30t
        -0x6t
        -0x36t
        0x5t
        0x1bt
        0x12t
        0x12t
        -0xet
        0x3t
        0x8t
        -0x2t
        0x12t
        -0x14t
        0xet
        0x35t
        -0x10t
        0x6t
        0x7t
        -0x2dt
        0x34t
        0x1t
        -0x1t
        -0x8t
        -0x6t
        0x14t
        0x0t
        -0xet
        0xft
        -0x2ft
        0x2dt
        -0x1t
        0x4t
        -0xet
        0x14t
        -0x23t
        0x12t
        0x12t
        -0xet
        0x3t
        0x8t
        -0x2t
        0x12t
        -0x14t
        0xet
    .end array-data
.end method

.method public constructor <init>()V
    .registers 2

    .line 43
    const-string v0, "CTNotificationIntentService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private static a(I[C[Ljava/lang/Object;)V
    .registers 28

    move-object/from16 v0, p1

    const/4 v1, 0x2

    .line 77
    rem-int v2, v1, v1

    .line 54
    new-instance v2, Lo/notifyDownloadChanged;

    invoke-direct {v2}, Lo/notifyDownloadChanged;-><init>()V

    move/from16 v3, p0

    .line 57
    iput v3, v2, Lo/notifyDownloadChanged;->read:I

    .line 60
    array-length v3, v0

    new-array v4, v3, [J

    const/4 v5, 0x0

    .line 63
    iput v5, v2, Lo/notifyDownloadChanged;->AudioAttributesCompatParcelizer:I

    :goto_14
    iget v6, v2, Lo/notifyDownloadChanged;->AudioAttributesCompatParcelizer:I

    array-length v7, v0

    const/4 v9, -0x1

    const-string v10, ""

    const/4 v12, 0x1

    if-ge v6, v7, :cond_fa

    .line 77
    sget v6, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$11:I

    add-int/lit8 v6, v6, 0x67

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$10:I

    rem-int/2addr v6, v1

    .line 64
    iget v6, v2, Lo/notifyDownloadChanged;->AudioAttributesCompatParcelizer:I

    iget v7, v2, Lo/notifyDownloadChanged;->AudioAttributesCompatParcelizer:I

    aget-char v7, v0, v7

    const/4 v13, 0x3

    :try_start_2d
    new-array v14, v13, [Ljava/lang/Object;

    aput-object v2, v14, v1

    aput-object v2, v14, v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v14, v5

    const v7, -0x5591433e

    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    const/16 v15, 0x30

    const-wide/16 v16, 0x0

    if-nez v7, :cond_88

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    const v18, 0x963d

    sub-int v7, v18, v7

    int-to-char v7, v7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v18

    cmp-long v8, v18, v16

    rsub-int v8, v8, 0x215

    invoke-static {v10, v15, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v18

    add-int/lit8 v20, v18, 0x9

    const v21, -0x2bd887a9

    const/16 v22, 0x0

    int-to-byte v15, v9

    add-int/lit8 v9, v15, 0x1

    int-to-byte v9, v9

    or-int/lit8 v11, v9, 0x9

    int-to-byte v11, v11

    invoke-static {v15, v9, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$g(BBB)Ljava/lang/String;

    move-result-object v23

    new-array v9, v13, [Ljava/lang/Class;

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v11, v9, v5

    const-class v11, Ljava/lang/Object;

    aput-object v11, v9, v12

    const-class v11, Ljava/lang/Object;

    aput-object v11, v9, v1

    move/from16 v18, v7

    move/from16 v19, v8

    move-object/from16 v24, v9

    invoke-static/range {v18 .. v24}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_88
    check-cast v7, Ljava/lang/reflect/Method;

    const/4 v8, 0x0

    invoke-virtual {v7, v8, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7
    :try_end_95
    .catchall {:try_start_2d .. :try_end_95} :catchall_f8

    sget-wide v13, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->write:J

    const-wide v18, 0x1e6d517fcf7f93cbL    # 4.072977087218949E-162

    xor-long v13, v13, v18

    xor-long/2addr v7, v13

    aput-wide v7, v4, v6

    .line 63
    :try_start_a1
    filled-new-array {v2, v2}, [Ljava/lang/Object;

    move-result-object v6

    const v7, 0x757fbec0

    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_f0

    const/16 v8, 0x30

    invoke-static {v10, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v7

    const v8, 0x8f0e

    add-int/2addr v7, v8

    int-to-char v7, v7

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v8

    cmp-long v8, v8, v16

    rsub-int v8, v8, 0x925

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    add-int/lit8 v20, v9, 0x1c

    const v21, 0xb367a55

    const/16 v22, 0x0

    const/4 v9, -0x1

    int-to-byte v9, v9

    add-int/lit8 v10, v9, 0x1

    int-to-byte v10, v10

    sget-object v11, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$c:[B

    aget-byte v11, v11, v1

    int-to-byte v11, v11

    invoke-static {v9, v10, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$g(BBB)Ljava/lang/String;

    move-result-object v23

    new-array v9, v1, [Ljava/lang/Class;

    const-class v10, Ljava/lang/Object;

    aput-object v10, v9, v5

    const-class v10, Ljava/lang/Object;

    aput-object v10, v9, v12

    move/from16 v18, v7

    move/from16 v19, v8

    move-object/from16 v24, v9

    invoke-static/range {v18 .. v24}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_f0
    check-cast v7, Ljava/lang/reflect/Method;

    const/4 v8, 0x0

    invoke-virtual {v7, v8, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f6
    .catchall {:try_start_a1 .. :try_end_f6} :catchall_f8

    goto/16 :goto_14

    :catchall_f8
    move-exception v0

    goto :goto_164

    .line 72
    :cond_fa
    new-array v3, v3, [C

    .line 73
    iput v5, v2, Lo/notifyDownloadChanged;->AudioAttributesCompatParcelizer:I

    .line 77
    sget v6, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$11:I

    add-int/lit8 v6, v6, 0x7d

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$10:I

    rem-int/2addr v6, v1

    .line 73
    :goto_107
    iget v6, v2, Lo/notifyDownloadChanged;->AudioAttributesCompatParcelizer:I

    array-length v7, v0

    if-ge v6, v7, :cond_16c

    .line 74
    iget v6, v2, Lo/notifyDownloadChanged;->AudioAttributesCompatParcelizer:I

    iget v7, v2, Lo/notifyDownloadChanged;->AudioAttributesCompatParcelizer:I

    aget-wide v7, v4, v7

    long-to-int v7, v7

    int-to-char v7, v7

    aput-char v7, v3, v6

    .line 73
    :try_start_116
    filled-new-array {v2, v2}, [Ljava/lang/Object;

    move-result-object v6

    const v7, 0x757fbec0

    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_15c

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v8

    const v9, 0x8f0d

    add-int/2addr v8, v9

    int-to-char v13, v8

    invoke-static {v5, v5}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    add-int/lit16 v14, v8, 0x924

    invoke-static {v10, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v8

    rsub-int/lit8 v15, v8, 0x1c

    const v16, 0xb367a55

    const/16 v17, 0x0

    const/4 v9, -0x1

    int-to-byte v8, v9

    add-int/lit8 v11, v8, 0x1

    int-to-byte v11, v11

    sget-object v18, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$c:[B

    aget-byte v7, v18, v1

    int-to-byte v7, v7

    invoke-static {v8, v11, v7}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$g(BBB)Ljava/lang/String;

    move-result-object v18

    new-array v7, v1, [Ljava/lang/Class;

    const-class v8, Ljava/lang/Object;

    aput-object v8, v7, v5

    const-class v8, Ljava/lang/Object;

    aput-object v8, v7, v12

    move-object/from16 v19, v7

    invoke-static/range {v13 .. v19}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    goto :goto_15d

    :cond_15c
    const/4 v9, -0x1

    :goto_15d
    check-cast v8, Ljava/lang/reflect/Method;

    const/4 v7, 0x0

    invoke-virtual {v8, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_163
    .catchall {:try_start_116 .. :try_end_163} :catchall_f8

    goto :goto_107

    .line 64
    :goto_164
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_16b

    throw v1

    :cond_16b
    throw v0

    .line 77
    :cond_16c
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    sget v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$10:I

    add-int/lit8 v2, v2, 0x63

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$11:I

    rem-int/2addr v2, v1

    if-eqz v2, :cond_17f

    aput-object v0, p2, v5

    return-void

    :cond_17f
    const/4 v0, 0x0

    throw v0
.end method

.method private static b([CC[C[CI[Ljava/lang/Object;)V
    .registers 33

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, 0x2

    .line 127
    rem-int v4, v3, v3

    .line 95
    new-instance v4, Lo/notifyDownloadRemoved;

    invoke-direct {v4}, Lo/notifyDownloadRemoved;-><init>()V

    .line 97
    array-length v5, v0

    new-array v6, v5, [C

    .line 98
    array-length v7, v1

    new-array v8, v7, [C

    const/4 v9, 0x0

    .line 99
    invoke-static {v0, v9, v6, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 100
    invoke-static {v1, v9, v8, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 101
    aget-char v0, v6, v9

    xor-int v0, v0, p1

    int-to-char v0, v0

    aput-char v0, v6, v9

    .line 102
    aget-char v0, v8, v3

    move/from16 v1, p4

    int-to-char v1, v1

    add-int/2addr v0, v1

    int-to-char v0, v0

    aput-char v0, v8, v3

    .line 104
    array-length v0, v2

    .line 105
    new-array v1, v0, [C

    .line 106
    iput v9, v4, Lo/notifyDownloadRemoved;->AudioAttributesCompatParcelizer:I

    :goto_30
    iget v5, v4, Lo/notifyDownloadRemoved;->AudioAttributesCompatParcelizer:I

    if-ge v5, v0, :cond_1cd

    .line 127
    sget v5, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$11:I

    add-int/lit8 v5, v5, 0x15

    rem-int/lit16 v7, v5, 0x80

    sput v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$10:I

    rem-int/lit8 v5, v5, 0x2

    .line 107
    :try_start_3e
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v5

    const v7, 0x2acd55fb

    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    const/4 v10, 0x1

    if-nez v7, :cond_79

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v7, v11, v13

    rsub-int/lit8 v7, v7, 0x1

    int-to-char v11, v7

    invoke-static {v9}, Landroid/graphics/Color;->red(I)I

    move-result v7

    add-int/lit16 v12, v7, 0x58dc

    invoke-static {v9}, Landroid/telephony/cdma/CdmaCellLocation;->convertQuartSecToDecDegrees(I)D

    move-result-wide v13

    const-wide/16 v15, 0x0

    cmpl-double v7, v13, v15

    add-int/lit8 v13, v7, 0x24

    const v14, 0x5484916e

    const/4 v15, 0x0

    const-string v16, "j"

    new-array v7, v10, [Ljava/lang/Class;

    const-class v17, Ljava/lang/Object;

    aput-object v17, v7, v9

    move-object/from16 v17, v7

    invoke-static/range {v11 .. v17}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_79
    check-cast v7, Ljava/lang/reflect/Method;

    const/4 v11, 0x0

    invoke-virtual {v7, v11, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 108
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v7

    const v12, 0xebc25d8

    invoke-static {v12}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_c7

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v12

    shr-int/lit8 v12, v12, 0x10

    add-int/lit16 v12, v12, 0x7a89

    int-to-char v13, v12

    const-string v12, ""

    invoke-static {v12, v9}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v12

    add-int/lit16 v14, v12, 0xaa1

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v12

    shr-int/lit8 v12, v12, 0x10

    add-int/lit8 v15, v12, 0x26

    const v16, 0x70f5e14d

    const/16 v17, 0x0

    const/4 v12, -0x1

    int-to-byte v12, v12

    add-int/lit8 v3, v12, 0x1

    int-to-byte v3, v3

    int-to-byte v11, v3

    invoke-static {v12, v3, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$g(BBB)Ljava/lang/String;

    move-result-object v18

    new-array v3, v10, [Ljava/lang/Class;

    const-class v11, Ljava/lang/Object;

    aput-object v11, v3, v9

    move-object/from16 v19, v3

    invoke-static/range {v13 .. v19}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    :cond_c7
    check-cast v12, Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    invoke-virtual {v12, v3, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v3
    :try_end_d4
    .catchall {:try_start_3e .. :try_end_d4} :catchall_1c4

    .line 111
    iget v7, v4, Lo/notifyDownloadRemoved;->AudioAttributesCompatParcelizer:I

    rem-int/lit8 v7, v7, 0x4

    aget-char v7, v6, v7

    mul-int/lit16 v7, v7, 0x7fce

    aget-char v11, v8, v5

    const/4 v12, 0x3

    :try_start_df
    new-array v13, v12, [Ljava/lang/Object;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v14, 0x2

    aput-object v11, v13, v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v13, v10

    aput-object v4, v13, v9

    const v7, -0x4fa6616e

    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_130

    invoke-static {v9, v9, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v7

    const/high16 v11, -0x1000000

    sub-int/2addr v11, v7

    int-to-char v7, v11

    invoke-static {v9}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v11

    const/4 v14, 0x0

    cmpl-float v11, v11, v14

    add-int/lit16 v11, v11, 0x3d61

    invoke-static {v9, v9, v9}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v14

    rsub-int/lit8 v22, v14, 0x40

    const v23, -0x31efa5f9

    const/16 v24, 0x0

    const-string v25, "f"

    new-array v12, v12, [Ljava/lang/Class;

    const-class v14, Ljava/lang/Object;

    aput-object v14, v12, v9

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v12, v10

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v15, 0x2

    aput-object v14, v12, v15

    move/from16 v20, v7

    move/from16 v21, v11

    move-object/from16 v26, v12

    invoke-static/range {v20 .. v26}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_130
    check-cast v7, Ljava/lang/reflect/Method;

    const/4 v11, 0x0

    invoke-virtual {v7, v11, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_136
    .catchall {:try_start_df .. :try_end_136} :catchall_1c4

    .line 113
    aget-char v7, v6, v3

    mul-int/lit16 v7, v7, 0x7fce

    aget-char v5, v8, v5

    const/4 v11, 0x2

    :try_start_13d
    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v12, v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v12, v9

    const v5, -0x5f800f72

    invoke-static {v5}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_183

    invoke-static {v9, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    const v7, 0xa010

    sub-int/2addr v7, v5

    int-to-char v13, v7

    invoke-static {v9}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    add-int/lit16 v14, v5, 0x17ea

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/lit8 v15, v5, 0x1d

    const v16, -0x21c9cbe5

    const/16 v17, 0x0

    const-string v18, "m"

    const/4 v5, 0x2

    new-array v7, v5, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v7, v9

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v7, v10

    move-object/from16 v19, v7

    invoke-static/range {v13 .. v19}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    :cond_183
    check-cast v5, Ljava/lang/reflect/Method;

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Character;

    invoke-virtual {v5}, Ljava/lang/Character;->charValue()C

    move-result v5
    :try_end_190
    .catchall {:try_start_13d .. :try_end_190} :catchall_1c4

    aput-char v5, v8, v3

    .line 115
    iget-char v5, v4, Lo/notifyDownloadRemoved;->write:C

    aput-char v5, v6, v3

    .line 118
    iget v5, v4, Lo/notifyDownloadRemoved;->AudioAttributesCompatParcelizer:I

    iget v7, v4, Lo/notifyDownloadRemoved;->AudioAttributesCompatParcelizer:I

    aget-char v7, v2, v7

    aget-char v3, v6, v3

    xor-int/2addr v3, v7

    int-to-long v11, v3

    sget-wide v13, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->read:J

    const-wide v15, -0x308e19fa082a2adcL    # -5.059834025732698E74

    xor-long/2addr v13, v15

    xor-long/2addr v11, v13

    sget v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->RemoteActionCompatParcelizer:I

    int-to-long v13, v3

    xor-long/2addr v13, v15

    long-to-int v3, v13

    int-to-long v13, v3

    xor-long/2addr v11, v13

    sget-char v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->AudioAttributesCompatParcelizer:C

    int-to-long v13, v3

    xor-long/2addr v13, v15

    long-to-int v3, v13

    int-to-char v3, v3

    int-to-long v13, v3

    xor-long/2addr v11, v13

    long-to-int v3, v11

    int-to-char v3, v3

    aput-char v3, v1, v5

    .line 106
    iget v3, v4, Lo/notifyDownloadRemoved;->AudioAttributesCompatParcelizer:I

    add-int/2addr v3, v10

    iput v3, v4, Lo/notifyDownloadRemoved;->AudioAttributesCompatParcelizer:I

    const/4 v3, 0x2

    goto/16 :goto_30

    :catchall_1c4
    move-exception v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_1cc

    throw v1

    :cond_1cc
    throw v0

    .line 127
    :cond_1cd
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    sget v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$10:I

    add-int/lit8 v1, v1, 0x5f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$11:I

    const/4 v2, 0x2

    rem-int/2addr v1, v2

    aput-object v0, p5, v9

    return-void
.end method

.method private static c(SBB[Ljava/lang/Object;)V
    .registers 10

    add-int/lit8 p0, p0, 0x4

    .line 0
    sget-object v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    add-int/lit8 v1, p1, 0x4

    rsub-int/lit8 p2, p2, 0x72

    new-array v1, v1, [B

    add-int/lit8 p1, p1, 0x3

    const/4 v2, 0x0

    if-nez v0, :cond_13

    move v3, p2

    move v4, v2

    move p2, p0

    goto :goto_2c

    :cond_13
    move v3, v2

    :goto_14
    int-to-byte v4, p2

    aput-byte v4, v1, v3

    if-ne v3, p1, :cond_21

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BI)V

    aput-object p0, p3, v2

    return-void

    :cond_21
    add-int/lit8 p0, p0, 0x1

    add-int/lit8 v3, v3, 0x1

    aget-byte v4, v0, p0

    move v5, p2

    move p2, p0

    move p0, v4

    move v4, v3

    move v3, v5

    :goto_2c
    add-int/2addr v3, p0

    add-int/lit8 p0, v3, -0x1

    move v3, v4

    move v5, p2

    move p2, p0

    move p0, v5

    goto :goto_14
.end method

.method private static d(BBS[Ljava/lang/Object;)V
    .registers 10

    add-int/lit8 p1, p1, 0x52

    add-int/lit8 p0, p0, 0x4

    .line 0
    sget-object v0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$d:[B

    add-int/lit8 v1, p2, 0x5

    new-array v1, v1, [B

    add-int/lit8 p2, p2, 0x4

    const/4 v2, 0x0

    if-nez v0, :cond_13

    move p1, p0

    move v3, p2

    move v4, v2

    goto :goto_2b

    :cond_13
    move v3, v2

    :goto_14
    int-to-byte v4, p1

    aput-byte v4, v1, v3

    add-int/lit8 p0, p0, 0x1

    add-int/lit8 v4, v3, 0x1

    if-ne v3, p2, :cond_25

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BI)V

    aput-object p0, p3, v2

    return-void

    :cond_25
    aget-byte v3, v0, p0

    move v5, p1

    move p1, p0

    move p0, v3

    move v3, v5

    :goto_2b
    add-int/2addr v3, p0

    add-int/lit8 p0, v3, 0x5

    move v3, v4

    move v5, p1

    move p1, p0

    move p0, v5

    goto :goto_14
.end method

.method private handleActionButtonClick(Landroid/os/Bundle;)V
    .registers 10

    const/4 v0, 0x2

    .line 125
    rem-int v1, v0, v0

    sget v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    add-int/lit8 v1, v1, 0x47

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    rem-int/2addr v1, v0

    const/4 v2, -0x1

    const-string v3, "notificationId"

    const/4 v4, 0x0

    const-string v5, "autoCancel"

    const-string v6, "dl"

    if-eqz v1, :cond_2f

    .line 73
    :try_start_16
    invoke-virtual {p1, v5, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 74
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 75
    invoke-virtual {p1, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 79
    iget-object v5, p0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->mActionButtonClickHandler:Lo/setAdPositionMs;

    .line 80
    invoke-interface {v5, v4, p1, v2}, Lo/setAdPositionMs;->IconCompatParcelizer(Landroid/content/Context;Landroid/os/Bundle;I)Z

    move-result v5

    if-eqz v5, :cond_48

    goto :goto_47

    .line 73
    :cond_2f
    invoke-virtual {p1, v5, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 74
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 75
    invoke-virtual {p1, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 79
    iget-object v5, p0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->mActionButtonClickHandler:Lo/setAdPositionMs;

    .line 80
    invoke-interface {v5, v4, p1, v2}, Lo/setAdPositionMs;->IconCompatParcelizer(Landroid/content/Context;Landroid/os/Bundle;I)Z

    move-result v5

    if-eqz v5, :cond_48

    :goto_47
    return-void

    .line 88
    :cond_48
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1f

    if-lt v5, v7, :cond_4f

    return-void

    :cond_4f
    if-eqz v3, :cond_60

    .line 95
    new-instance v5, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v5, v7, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 96
    invoke-static {v4, v5}, Lo/RendererCapabilitiesListener;->RemoteActionCompatParcelizer(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_6c

    .line 98
    :cond_60
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5
    :try_end_6c
    .catchall {:try_start_16 .. :try_end_6c} :catchall_d0

    :goto_6c
    if-nez v5, :cond_82

    .line 80
    sget p0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 p0, p0, 0x35

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr p0, v0

    if-eqz p0, :cond_7d

    .line 102
    :try_start_79
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-void

    :cond_7d
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    const/4 p0, 0x0

    throw p0

    :cond_82
    const/high16 v3, 0x34000000

    .line 106
    invoke-virtual {v5, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 109
    invoke-virtual {v5, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 110
    invoke-virtual {v5, v6}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 112
    const-string v3, "pt_dismiss_on_click"

    const-string v4, ""

    invoke-virtual {p1, v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_c2

    if-ltz v2, :cond_c2

    .line 114
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_c2

    .line 116
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "notification"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;
    :try_end_ab
    .catchall {:try_start_79 .. :try_end_ab} :catchall_d0

    if-eqz p1, :cond_c2

    .line 125
    sget v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 v1, v1, 0x47

    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr v1, v0

    .line 118
    :try_start_b6
    invoke-virtual {p1, v2}, Landroid/app/NotificationManager;->cancel(I)V
    :try_end_b9
    .catchall {:try_start_b6 .. :try_end_b9} :catchall_d0

    .line 80
    sget p1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 p1, p1, 0x39

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr p1, v0

    .line 122
    :cond_c2
    :try_start_c2
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 123
    invoke-virtual {p0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_cf
    .catchall {:try_start_c2 .. :try_end_cf} :catchall_d0

    return-void

    :catchall_d0
    move-exception p0

    .line 125
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .registers 40

    move-object/from16 v1, p1

    const/4 v2, 0x2

    .line 781
    rem-int v3, v2, v2

    .line 290
    sget v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 v3, v3, 0x7d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr v3, v2

    .line 149
    invoke-super/range {p0 .. p1}, Landroid/app/IntentService;->attachBaseContext(Landroid/content/Context;)V

    const v3, 0xc1bd

    const/4 v4, 0x0

    .line 153
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    add-int/2addr v5, v3

    const/16 v3, 0x12

    new-array v3, v3, [C

    fill-array-data v3, :array_14bc

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v5, v3, v7}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v3, v7, v4

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 160
    const-string v5, "android.app.ActivityThread"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    new-array v8, v4, [Ljava/lang/Class;

    const-string v9, "currentApplication"

    invoke-virtual {v7, v9, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const/4 v8, 0x0

    move-object v10, v8

    check-cast v10, [Ljava/lang/Object;

    invoke-virtual {v7, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v7

    add-int/lit16 v7, v7, 0x7b9a

    const/4 v10, 0x5

    new-array v11, v10, [C

    fill-array-data v11, :array_14d2

    new-array v12, v6, [Ljava/lang/Object;

    invoke-static {v7, v11, v12}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v7, v12, v4

    check-cast v7, Ljava/lang/String;

    new-array v11, v4, [Ljava/lang/Class;

    invoke-virtual {v3, v7, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v7, v4, [Ljava/lang/Object;

    invoke-virtual {v3, v8, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 168
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const v7, 0x186a0

    rem-int/2addr v3, v7

    const v7, 0x182b8

    const/16 v14, 0x30

    const-string v15, ""

    const/4 v10, 0x4

    if-lt v3, v7, :cond_9d

    .line 290
    sget v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    add-int/lit8 v7, v7, 0x2f

    rem-int/lit16 v12, v7, 0x80

    sput v12, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    rem-int/2addr v7, v2

    if-eqz v7, :cond_98

    const/16 v7, 0x56

    .line 173
    div-int/2addr v7, v4

    const v7, 0x1869f

    if-le v3, v7, :cond_35b

    goto :goto_9d

    :cond_98
    const v7, 0x1869f

    if-le v3, v7, :cond_35b

    :cond_9d
    :goto_9d
    if-eqz v1, :cond_c5

    .line 290
    sget v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 v7, v3, 0x61

    rem-int/lit16 v12, v7, 0x80

    sput v12, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr v7, v2

    .line 181
    instance-of v7, v1, Landroid/content/ContextWrapper;

    xor-int/2addr v7, v6

    if-eqz v7, :cond_ae

    goto :goto_be

    :cond_ae
    add-int/lit8 v3, v3, 0x29

    .line 290
    rem-int/lit16 v7, v3, 0x80

    sput v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr v3, v2

    .line 181
    move-object v3, v1

    check-cast v3, Landroid/content/ContextWrapper;

    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    if-eqz v3, :cond_c3

    .line 182
    :goto_be
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    goto :goto_c6

    :cond_c3
    move-object v3, v8

    goto :goto_c6

    :cond_c5
    move-object v3, v1

    :goto_c6
    if-eqz v3, :cond_35b

    .line 290
    sget v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    add-int/lit8 v7, v7, 0x45

    rem-int/lit16 v12, v7, 0x80

    sput v12, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    rem-int/2addr v7, v2

    const v7, -0x53de561a

    .line 188
    :try_start_d4
    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_100

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v7

    add-int/lit16 v7, v7, 0x11b7

    int-to-char v7, v7

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v12

    add-int/lit16 v12, v12, 0x17a6

    invoke-static {v15, v14}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v17

    rsub-int/lit8 v19, v17, 0x29

    const v20, -0x2d97928d

    const/16 v21, 0x0

    const-string v22, "IconCompatParcelizer"

    new-array v13, v4, [Ljava/lang/Class;

    move/from16 v17, v7

    move/from16 v18, v12

    move-object/from16 v23, v13

    invoke-static/range {v17 .. v23}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_100
    check-cast v7, Ljava/lang/reflect/Method;

    invoke-virtual {v7, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_106
    .catchall {:try_start_d4 .. :try_end_106} :catchall_357

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v12

    shr-int/lit8 v12, v12, 0x16

    add-int/lit16 v12, v12, 0x4c73

    new-array v13, v14, [C

    fill-array-data v13, :array_14dc

    new-array v14, v6, [Ljava/lang/Object;

    invoke-static {v12, v13, v14}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v12, v14, v4

    check-cast v12, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v13

    new-array v14, v4, [Ljava/lang/Class;

    invoke-virtual {v13, v9, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v13

    invoke-virtual {v13, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const v14, 0x7f1301c8

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v4, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    const v14, 0xd863

    add-int/2addr v13, v14

    const/16 v14, 0x40

    new-array v14, v14, [C

    fill-array-data v14, :array_1510

    new-array v11, v6, [Ljava/lang/Object;

    invoke-static {v13, v14, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v11, v11, v4

    check-cast v11, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v13

    new-array v14, v4, [Ljava/lang/Class;

    invoke-virtual {v13, v9, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v13

    invoke-virtual {v13, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const v14, 0x7f1301c8

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v4, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    const v14, 0x838b

    add-int/2addr v13, v14

    const/16 v14, 0x40

    new-array v14, v14, [C

    fill-array-data v14, :array_1554

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v13, v14, v2}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v2, v2, v4

    check-cast v2, Ljava/lang/String;

    .line 195
    new-array v13, v10, [C

    fill-array-data v13, :array_1598

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v14

    new-array v6, v4, [Ljava/lang/Class;

    invoke-virtual {v14, v9, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v14, 0x7f1301ce

    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v4, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const/4 v14, 0x2

    invoke-virtual {v6, v14}, Ljava/lang/String;->codePointAt(I)I

    move-result v6

    const v14, 0xde55

    add-int/2addr v6, v14

    int-to-char v6, v6

    new-array v14, v10, [C

    fill-array-data v14, :array_15a0

    const/16 v10, 0x43

    new-array v10, v10, [C

    fill-array-data v10, :array_15a8

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    new-array v1, v4, [Ljava/lang/Class;

    invoke-virtual {v8, v9, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v8, 0x0

    invoke-virtual {v1, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v8, 0x7f0b002a

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    and-int/lit8 v1, v1, -0x3

    const v8, -0x4be9a7a3

    add-int v28, v1, v8

    const/4 v1, 0x1

    new-array v8, v1, [Ljava/lang/Object;

    move-object/from16 v24, v13

    move/from16 v25, v6

    move-object/from16 v26, v14

    move-object/from16 v27, v10

    move-object/from16 v29, v8

    invoke-static/range {v24 .. v29}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v1, v8, v4

    check-cast v1, Ljava/lang/String;

    const/4 v6, 0x4

    new-array v8, v6, [C

    fill-array-data v8, :array_15f0

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    new-array v10, v4, [Ljava/lang/Class;

    invoke-virtual {v6, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v10, 0x0

    invoke-virtual {v6, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    iget v6, v6, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    add-int/lit16 v6, v6, 0x32a5

    int-to-char v6, v6

    const/4 v10, 0x4

    new-array v13, v10, [C

    fill-array-data v13, :array_15f8

    const/4 v10, 0x6

    new-array v14, v10, [C

    fill-array-data v14, :array_1600

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    move-object/from16 v23, v7

    new-array v7, v4, [Ljava/lang/Class;

    invoke-virtual {v10, v9, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const/4 v10, 0x0

    invoke-virtual {v7, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    iget v7, v7, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    add-int/lit8 v28, v7, -0x23

    const/4 v7, 0x1

    new-array v10, v7, [Ljava/lang/Object;

    move-object/from16 v24, v8

    move/from16 v25, v6

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    move-object/from16 v29, v10

    invoke-static/range {v24 .. v29}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v6, v10, v4

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x4

    .line 199
    new-array v8, v7, [C

    fill-array-data v8, :array_160a

    const/16 v10, 0x30

    invoke-static {v15, v10, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v13

    const/4 v10, 0x1

    add-int/2addr v13, v10

    int-to-char v10, v13

    new-array v13, v7, [C

    fill-array-data v13, :array_1612

    const/16 v7, 0x24

    new-array v7, v7, [C

    fill-array-data v7, :array_161a

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v14

    move-object/from16 v30, v5

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v14, v9, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/4 v14, 0x0

    invoke-virtual {v5, v14, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v14, 0x7f0b002a

    invoke-virtual {v5, v14}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v5

    and-int/lit8 v5, v5, -0x3

    add-int/lit8 v28, v5, -0x1

    const/4 v5, 0x1

    new-array v14, v5, [Ljava/lang/Object;

    move-object/from16 v24, v8

    move/from16 v25, v10

    move-object/from16 v26, v13

    move-object/from16 v27, v7

    move-object/from16 v29, v14

    invoke-static/range {v24 .. v29}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v5, v14, v4

    check-cast v5, Ljava/lang/String;

    const/16 v7, 0x9

    .line 206
    :try_start_2c5
    new-array v7, v7, [Ljava/lang/Object;

    const v8, 0x15180

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v10, 0x8

    aput-object v8, v7, v10

    const/4 v8, 0x7

    aput-object v5, v7, v8

    const/4 v5, 0x6

    aput-object v6, v7, v5

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/4 v8, 0x5

    aput-object v6, v7, v8

    const/4 v6, 0x4

    aput-object v1, v7, v6

    const/4 v1, 0x3

    aput-object v2, v7, v1

    const/4 v1, 0x2

    aput-object v11, v7, v1

    aput-object v12, v7, v5

    aput-object v3, v7, v4

    const v1, 0x1ac072a3

    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_34f

    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    int-to-char v1, v1

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    add-int/lit16 v2, v2, 0x178e

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v3

    const/16 v5, 0x8

    shr-int/2addr v3, v5

    rsub-int/lit8 v33, v3, 0x18

    const v34, 0x6489b636

    const/16 v35, 0x0

    const-string v36, "AudioAttributesCompatParcelizer"

    const/16 v3, 0x9

    new-array v3, v3, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    aput-object v5, v3, v4

    const-class v5, Ljava/lang/String;

    const/4 v6, 0x1

    aput-object v5, v3, v6

    const-class v5, Ljava/lang/String;

    const/4 v6, 0x2

    aput-object v5, v3, v6

    const-class v5, Ljava/lang/String;

    const/4 v6, 0x3

    aput-object v5, v3, v6

    const-class v5, Ljava/lang/String;

    const/4 v6, 0x4

    aput-object v5, v3, v6

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x5

    aput-object v5, v3, v6

    const-class v5, Ljava/lang/String;

    const/4 v6, 0x6

    aput-object v5, v3, v6

    const-class v5, Ljava/lang/String;

    const/4 v6, 0x7

    aput-object v5, v3, v6

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v6, 0x8

    aput-object v5, v3, v6

    move/from16 v31, v1

    move/from16 v32, v2

    move-object/from16 v37, v3

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_34f
    check-cast v1, Ljava/lang/reflect/Method;

    move-object/from16 v2, v23

    invoke-virtual {v1, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_356
    .catchall {:try_start_2c5 .. :try_end_356} :catchall_357

    goto :goto_35d

    :catchall_357
    move-exception v0

    move-object v1, v0

    goto/16 :goto_14b4

    :cond_35b
    move-object/from16 v30, v5

    :goto_35d
    const v1, -0x115c9e9

    const v3, 0x298664b5

    const/16 v6, 0xc

    const-wide/16 v7, 0x0

    const/16 v10, 0x10

    .line 212
    :try_start_369
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3af

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v1

    const v11, 0xeedc

    sub-int/2addr v11, v1

    int-to-char v1, v11

    invoke-static {v15, v15, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v11

    rsub-int v11, v11, 0x861

    const/4 v12, 0x0

    invoke-static {v12, v12}, Landroid/graphics/PointF;->length(FF)F

    move-result v13

    cmpl-float v13, v13, v12

    add-int/lit8 v33, v13, 0xc

    const v34, -0x7f5c0d7e

    const/16 v35, 0x0

    sget-object v12, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v13, 0x14

    aget-byte v13, v12, v13

    int-to-short v13, v13

    const/16 v14, 0x8

    aget-byte v12, v12, v14

    int-to-byte v12, v12

    int-to-byte v14, v12

    const/4 v5, 0x1

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v13, v12, v14, v2}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v2, v2, v4

    move-object/from16 v36, v2

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v1

    move/from16 v32, v11

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_3af
    check-cast v1, Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v11

    const-wide/16 v1, -0x1

    cmp-long v1, v11, v1

    if-eqz v1, :cond_415

    const v1, -0x257fb457

    .line 216
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_40a

    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const v2, 0xeedc

    add-int/2addr v1, v2

    int-to-char v1, v1

    const/16 v2, 0x30

    invoke-static {v15, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v5

    add-int/lit16 v2, v5, 0x862

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v5

    shr-int/2addr v5, v10

    add-int/lit8 v33, v5, 0xc

    const v34, -0x5b3670c4

    const/16 v35, 0x0

    sget-object v5, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v11, 0x66

    aget-byte v11, v5, v11

    int-to-short v11, v11

    const/16 v12, 0x1c

    aget-byte v12, v5, v12

    neg-int v12, v12

    int-to-byte v12, v12

    const/16 v13, 0x8c

    aget-byte v5, v5, v13

    int-to-byte v5, v5

    const/4 v13, 0x1

    new-array v14, v13, [Ljava/lang/Object;

    invoke-static {v11, v12, v5, v14}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v5, v14, v4

    move-object/from16 v36, v5

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v1

    move/from16 v32, v2

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_40a
    check-cast v1, Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    goto/16 :goto_7a9

    :cond_415
    const/4 v1, 0x4

    .line 217
    new-array v2, v1, [C

    fill-array-data v2, :array_1642

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v1, v9, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v5, 0x0

    move-object v11, v5

    check-cast v11, [Ljava/lang/Object;

    invoke-virtual {v1, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v5, 0x7f1301ce

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const v11, 0xa565

    add-int/2addr v1, v11

    int-to-char v1, v1

    new-array v11, v5, [C

    fill-array-data v11, :array_164a

    new-array v5, v10, [C

    fill-array-data v5, :array_1652

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    new-array v13, v4, [Ljava/lang/Class;

    invoke-virtual {v12, v9, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12

    const/4 v13, 0x0

    move-object v14, v13

    check-cast v14, [Ljava/lang/Object;

    invoke-virtual {v12, v13, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v13, 0x7f130404

    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x4

    invoke-virtual {v12, v4, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Ljava/lang/String;->codePointAt(I)I

    move-result v12

    add-int/lit8 v35, v12, -0x31

    new-array v12, v13, [Ljava/lang/Object;

    move-object/from16 v31, v2

    move/from16 v32, v1

    move-object/from16 v33, v11

    move-object/from16 v34, v5

    move-object/from16 v36, v12

    invoke-static/range {v31 .. v36}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v1, v12, v4

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v9, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v5, 0x0

    move-object v11, v5

    check-cast v11, [Ljava/lang/Object;

    invoke-virtual {v2, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f130404

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x4

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit16 v2, v2, 0x49b1

    new-array v5, v10, [C

    fill-array-data v5, :array_1666

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v2, v5, v12}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v2, v12, v4

    check-cast v2, Ljava/lang/String;

    new-array v5, v11, [Ljava/lang/Class;

    const-class v11, Ljava/lang/Object;

    aput-object v11, v5, v4

    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 223
    filled-new-array/range {p0 .. p0}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 231
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1
    :try_end_4f2
    .catchall {:try_start_369 .. :try_end_4f2} :catchall_909

    const/4 v2, 0x1

    .line 244
    :try_start_4f3
    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v4

    const v2, -0xa552390

    invoke-static {v2}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_536

    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v2

    const/4 v11, 0x0

    cmpl-float v2, v2, v11

    const v11, 0xb315

    add-int/2addr v2, v11

    int-to-char v2, v2

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v11

    rsub-int v11, v11, 0x391

    const/16 v12, 0x30

    invoke-static {v15, v12, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v13

    rsub-int/lit8 v33, v13, 0x9

    const v34, -0x741ce71b

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/4 v12, 0x1

    new-array v13, v12, [Ljava/lang/Class;

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v12, v13, v4

    move/from16 v31, v2

    move/from16 v32, v11

    move-object/from16 v37, v13

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    :cond_536
    check-cast v2, Ljava/lang/reflect/Constructor;

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_53c
    .catchall {:try_start_4f3 .. :try_end_53c} :catchall_8ff

    const/4 v5, 0x2

    :try_start_53d
    new-array v11, v5, [Ljava/lang/Object;

    const/4 v5, 0x1

    aput-object v2, v11, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v11, v4

    const v1, 0x70bf74a6

    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5c1

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    const v2, 0xeedc

    sub-int/2addr v2, v1

    int-to-char v1, v2

    invoke-static {v4, v4}, Landroid/view/View;->resolveSize(II)I

    move-result v2

    rsub-int v2, v2, 0x861

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v5

    const/16 v12, 0x8

    shr-int/2addr v5, v12

    rsub-int/lit8 v33, v5, 0xc

    const v34, 0xef6b033

    const/16 v35, 0x0

    sget-object v5, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v12, 0x94

    aget-byte v12, v5, v12

    const/4 v13, 0x1

    sub-int/2addr v12, v13

    int-to-short v12, v12

    const/16 v13, 0x22

    aget-byte v13, v5, v13

    neg-int v13, v13

    int-to-byte v13, v13

    const/16 v14, 0x8b

    aget-byte v5, v5, v14

    neg-int v5, v5

    int-to-byte v5, v5

    const/4 v14, 0x1

    new-array v7, v14, [Ljava/lang/Object;

    invoke-static {v12, v13, v5, v7}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v5, v7, v4

    move-object/from16 v36, v5

    check-cast v36, Ljava/lang/String;

    const/4 v5, 0x2

    new-array v7, v5, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v7, v4

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v5

    int-to-byte v5, v5

    const/4 v8, 0x1

    add-int/2addr v5, v8

    int-to-char v5, v5

    invoke-static {v15, v4}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v8

    rsub-int v8, v8, 0x22d

    invoke-static {v4}, Landroid/telephony/cdma/CdmaCellLocation;->convertQuartSecToDecDegrees(I)D

    move-result-wide v12

    const-wide/16 v27, 0x0

    cmpl-double v12, v12, v27

    add-int/lit8 v12, v12, 0x12

    invoke-static {v5, v8, v12}, Lo/startForeground;->IconCompatParcelizer(CII)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    const/4 v8, 0x1

    aput-object v5, v7, v8

    move/from16 v31, v1

    move/from16 v32, v2

    move-object/from16 v37, v7

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_5c1
    check-cast v1, Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;
    :try_end_5ca
    .catchall {:try_start_53d .. :try_end_5ca} :catchall_8f5

    const v2, -0x257fb457

    .line 246
    :try_start_5cd
    invoke-static {v2}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_61c

    const/16 v5, 0x30

    invoke-static {v5}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v2

    const v5, 0xeeac

    add-int/2addr v2, v5

    int-to-char v2, v2

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v7

    const-wide/16 v11, -0x1

    cmp-long v5, v7, v11

    rsub-int v5, v5, 0x862

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v7

    shr-int/2addr v7, v10

    add-int/lit8 v33, v7, 0xc

    const v34, -0x5b3670c4

    const/16 v35, 0x0

    sget-object v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v8, 0x66

    aget-byte v8, v7, v8

    int-to-short v8, v8

    const/16 v11, 0x1c

    aget-byte v11, v7, v11

    neg-int v11, v11

    int-to-byte v11, v11

    const/16 v12, 0x8c

    aget-byte v7, v7, v12

    int-to-byte v7, v7

    const/4 v12, 0x1

    new-array v13, v12, [Ljava/lang/Object;

    invoke-static {v8, v11, v7, v13}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v7, v13, v4

    move-object/from16 v36, v7

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v2

    move/from16 v32, v5

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    :cond_61c
    check-cast v2, Ljava/lang/reflect/Field;

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x4

    new-array v5, v2, [C

    fill-array-data v5, :array_167a

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v7, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v9, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v7, 0x0

    move-object v8, v7

    check-cast v8, [Ljava/lang/Object;

    invoke-virtual {v2, v7, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v7, 0x7f130404

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x4

    invoke-virtual {v2, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    add-int/lit8 v2, v2, -0x31

    int-to-char v2, v2

    new-array v8, v7, [C

    fill-array-data v8, :array_1682

    const/16 v7, 0x16

    new-array v7, v7, [C

    fill-array-data v7, :array_168a

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    new-array v12, v4, [Ljava/lang/Class;

    invoke-virtual {v11, v9, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    const/4 v12, 0x0

    move-object v13, v12

    check-cast v13, [Ljava/lang/Object;

    invoke-virtual {v11, v12, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    const v12, 0x7f130404

    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x4

    invoke-virtual {v11, v4, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x3

    invoke-virtual {v11, v12}, Ljava/lang/String;->codePointAt(I)I

    move-result v11

    add-int/lit8 v35, v11, -0x73

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Object;

    move-object/from16 v31, v5

    move/from16 v32, v2

    move-object/from16 v33, v8

    move-object/from16 v34, v7

    move-object/from16 v36, v12

    invoke-static/range {v31 .. v36}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v2, v12, v4

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 250
    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    new-array v7, v4, [Ljava/lang/Class;

    invoke-virtual {v5, v9, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/4 v7, 0x0

    move-object v8, v7

    check-cast v8, [Ljava/lang/Object;

    invoke-virtual {v5, v7, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f0b002a

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v5

    and-int/lit8 v5, v5, -0x3

    add-int/lit16 v5, v5, 0x1a3e

    const/16 v7, 0xf

    new-array v7, v7, [C

    fill-array-data v7, :array_16a4

    const/4 v8, 0x1

    new-array v11, v8, [Ljava/lang/Object;

    invoke-static {v5, v7, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v5, v11, v4

    check-cast v5, Ljava/lang/String;

    new-array v7, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 254
    new-array v5, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-virtual {v2, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 259
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    .line 262
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const v5, 0x11fd9fa6

    invoke-static {v5}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_74a

    const/16 v11, 0x30

    invoke-static {v11}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v5

    const v11, 0xef0c

    sub-int/2addr v11, v5

    int-to-char v5, v11

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v11

    shr-int/2addr v11, v10

    rsub-int v11, v11, 0x861

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    add-int/lit8 v33, v12, 0xc

    const v34, 0x6fb45b33

    const/16 v35, 0x0

    sget-object v12, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v13, 0x64

    aget-byte v13, v12, v13

    const/4 v14, 0x1

    sub-int/2addr v13, v14

    int-to-short v13, v13

    const/16 v16, 0x7

    aget-byte v20, v12, v16

    add-int/lit8 v3, v20, -0x1

    int-to-byte v3, v3

    const/16 v20, 0x94

    aget-byte v12, v12, v20

    int-to-byte v12, v12

    new-array v10, v14, [Ljava/lang/Object;

    invoke-static {v13, v3, v12, v10}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v3, v10, v4

    move-object/from16 v36, v3

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v5

    move/from16 v32, v11

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    :cond_74a
    check-cast v5, Ljava/lang/reflect/Field;

    const/4 v3, 0x0

    invoke-virtual {v5, v3, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    shr-long v2, v7, v6

    .line 264
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const v3, -0x115c9e9

    invoke-static {v3}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7a3

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v3

    const/16 v5, 0x10

    shr-int/2addr v3, v5

    const v5, 0xeedc

    sub-int/2addr v5, v3

    int-to-char v3, v5

    invoke-static {v15, v15, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v5

    rsub-int v5, v5, 0x861

    const/16 v7, 0x30

    invoke-static {v15, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v8

    const/16 v7, 0xb

    rsub-int/lit8 v33, v8, 0xb

    const v34, -0x7f5c0d7e

    const/16 v35, 0x0

    sget-object v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v8, 0x14

    aget-byte v8, v7, v8

    int-to-short v8, v8

    const/16 v10, 0x8

    aget-byte v7, v7, v10

    int-to-byte v7, v7

    int-to-byte v10, v7

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v8, v7, v10, v12}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v7, v12, v4

    move-object/from16 v36, v7

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v3

    move/from16 v32, v5

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    :cond_7a3
    check-cast v3, Ljava/lang/reflect/Field;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    :goto_7a9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7ad
    :goto_7ad
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2
    :try_end_7b1
    .catchall {:try_start_5cd .. :try_end_7b1} :catchall_909

    if-eqz v2, :cond_8f1

    .line 781
    sget v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 v2, v2, 0x5b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    const/4 v3, 0x2

    rem-int/2addr v2, v3

    if-nez v2, :cond_7d6

    .line 273
    :try_start_7bf
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    const/4 v3, 0x4

    .line 283
    aget-object v5, v2, v3

    check-cast v5, [I

    const/4 v3, 0x1

    aget v5, v5, v3

    aget-object v3, v2, v4

    check-cast v3, [I

    aget v3, v3, v4

    if-eq v3, v5, :cond_7ad

    goto :goto_7ec

    .line 273
    :cond_7d6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    .line 283
    aget-object v5, v2, v3

    check-cast v5, [I

    aget v5, v5, v4

    const/4 v3, 0x1

    aget-object v7, v2, v3

    check-cast v7, [I

    aget v3, v7, v4

    if-eq v3, v5, :cond_7ad

    .line 290
    :goto_7ec
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x2

    .line 293
    aget-object v2, v2, v8

    check-cast v2, [Ljava/lang/String;

    if-eqz v2, :cond_804

    move v8, v4

    .line 298
    :goto_7f9
    array-length v10, v2

    if-ge v8, v10, :cond_804

    .line 302
    aget-object v10, v2, v8

    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_801
    .catchall {:try_start_7bf .. :try_end_801} :catchall_909

    add-int/lit8 v8, v8, 0x1

    goto :goto_7f9

    :cond_804
    xor-int v2, v3, v5

    int-to-long v2, v2

    int-to-long v10, v4

    const/16 v5, 0x20

    shl-long/2addr v10, v5

    const/4 v8, -0x1

    int-to-long v12, v8

    const/16 v8, 0x3f

    shr-long v31, v12, v8

    shl-long v31, v31, v5

    sub-long v12, v12, v31

    or-long/2addr v10, v12

    and-long/2addr v2, v10

    const/16 v8, 0xa

    int-to-long v10, v8

    shl-long/2addr v10, v5

    int-to-long v12, v4

    const/16 v8, 0x3f

    shr-long v31, v12, v8

    shl-long v31, v31, v5

    sub-long v12, v12, v31

    or-long/2addr v10, v12

    or-long/2addr v2, v10

    const v5, -0x53de561a

    .line 311
    :try_start_829
    invoke-static {v5}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_85a

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v5

    const/4 v8, 0x0

    cmpl-float v5, v5, v8

    rsub-int v5, v5, 0x11b7

    int-to-char v5, v5

    const/16 v8, 0x30

    invoke-static {v15, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v10

    rsub-int v8, v10, 0x17a5

    invoke-static {v15, v4, v4}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v10

    add-int/lit8 v33, v10, 0x2a

    const v34, -0x2d97928d

    const/16 v35, 0x0

    const-string v36, "IconCompatParcelizer"

    new-array v10, v4, [Ljava/lang/Class;

    move/from16 v31, v5

    move/from16 v32, v8

    move-object/from16 v37, v10

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    :cond_85a
    check-cast v5, Ljava/lang/reflect/Method;

    const/4 v8, 0x0

    invoke-virtual {v5, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_861
    .catchall {:try_start_829 .. :try_end_861} :catchall_8e7

    .line 315
    :try_start_861
    invoke-static {}, Lcom/marrow/TrainingApplication;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object v8
    :try_end_865
    .catchall {:try_start_861 .. :try_end_865} :catchall_909

    const/4 v10, 0x5

    .line 323
    :try_start_866
    new-array v11, v10, [Ljava/lang/Object;

    .line 333
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const/4 v12, 0x4

    .line 342
    aput-object v10, v11, v12

    const/4 v10, 0x3

    .line 347
    aput-object v8, v11, v10

    const/4 v8, 0x2

    .line 355
    aput-object v7, v11, v8

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    .line 364
    aput-object v2, v11, v3

    const v2, 0x298664b5

    .line 367
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v11, v4

    invoke-static {v4}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v2

    rsub-int/lit8 v2, v2, -0x1

    int-to-char v2, v2

    const/16 v3, 0x30

    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v7

    add-int/lit16 v7, v7, 0x175e

    invoke-static {v15}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    add-int/lit8 v3, v3, 0x18

    invoke-static {v2, v7, v3}, Lo/startForeground;->IconCompatParcelizer(CII)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    sget-object v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$d:[B

    const/16 v7, 0xd

    aget-byte v7, v3, v7

    neg-int v7, v7

    int-to-byte v7, v7

    const/4 v8, 0x7

    aget-byte v3, v3, v8

    int-to-byte v3, v3

    or-int/lit8 v8, v3, 0x17

    int-to-byte v8, v8

    const/4 v10, 0x1

    new-array v12, v10, [Ljava/lang/Object;

    invoke-static {v7, v3, v8, v12}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->d(BBS[Ljava/lang/Object;)V

    aget-object v3, v12, v4

    check-cast v3, Ljava/lang/String;

    const/4 v7, 0x5

    new-array v8, v7, [Ljava/lang/Class;

    .line 372
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v8, v4

    .line 374
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v10, 0x1

    .line 375
    aput-object v7, v8, v10

    const-class v7, Ljava/util/List;

    const/4 v10, 0x2

    aput-object v7, v8, v10

    const-class v7, Ljava/lang/String;

    const/4 v10, 0x3

    aput-object v7, v8, v10

    .line 385
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v10, 0x4

    aput-object v7, v8, v10

    invoke-virtual {v2, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8db
    .catchall {:try_start_866 .. :try_end_8db} :catchall_8dd

    goto/16 :goto_7ad

    :catchall_8dd
    move-exception v0

    move-object v1, v0

    .line 316
    :try_start_8df
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_8e6

    throw v2

    :cond_8e6
    throw v1

    :catchall_8e7
    move-exception v0

    move-object v1, v0

    .line 311
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_8f0

    throw v2

    :cond_8f0
    throw v1

    :cond_8f1
    :goto_8f1
    move-object/from16 v1, p1

    goto/16 :goto_a2d

    :catchall_8f5
    move-exception v0

    move-object v1, v0

    .line 244
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_8fe

    throw v2

    :cond_8fe
    throw v1

    :catchall_8ff
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_908

    throw v2

    :cond_908
    throw v1
    :try_end_909
    .catchall {:try_start_8df .. :try_end_909} :catchall_909

    :catchall_909
    move-exception v0

    move-object v1, v0

    .line 385
    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v9, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1301ce

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    add-int/lit16 v2, v2, 0x837

    const/16 v3, 0xb

    new-array v5, v3, [C

    fill-array-data v5, :array_16b8

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v5, v7}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v2, v7, v4

    check-cast v2, Ljava/lang/String;

    :try_start_948
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v5, Ljava/io/PrintStream;

    invoke-direct {v5, v3}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v1, v5}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V

    const-string v5, "UTF-8"

    invoke-virtual {v3, v5}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_95e
    .catchall {:try_start_948 .. :try_end_95e} :catchall_95f

    goto :goto_963

    :catchall_95f
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_963
    new-instance v3, Ljava/util/ArrayList;

    const/4 v5, 0x2

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const v1, -0x53de561a

    :try_start_972
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_9a3

    const/16 v2, 0x30

    invoke-static {v15, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    add-int/lit16 v1, v1, 0x11b8

    int-to-char v1, v1

    invoke-static {v15, v15}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v2

    add-int/lit16 v2, v2, 0x17a6

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v5

    const/16 v7, 0x10

    shr-int/2addr v5, v7

    add-int/lit8 v33, v5, 0x2a

    const v34, -0x2d97928d

    const/16 v35, 0x0

    const-string v36, "IconCompatParcelizer"

    new-array v5, v4, [Ljava/lang/Class;

    move/from16 v31, v1

    move/from16 v32, v2

    move-object/from16 v37, v5

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_9a3
    check-cast v1, Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_9aa
    .catchall {:try_start_972 .. :try_end_9aa} :catchall_357

    invoke-static {}, Lcom/marrow/TrainingApplication;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x5

    :try_start_9af
    new-array v7, v5, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v8, 0x4

    aput-object v5, v7, v8

    const/4 v5, 0x3

    aput-object v2, v7, v5

    const/4 v2, 0x2

    aput-object v3, v7, v2

    const-wide v2, 0x1300000001L

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v7, v3

    const v2, 0x298664b5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v7, v4

    invoke-static {v4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v2

    const-wide/16 v10, 0x0

    cmp-long v2, v2, v10

    int-to-char v2, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v12

    cmp-long v3, v12, v10

    add-int/lit16 v3, v3, 0x178d

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x18

    invoke-static {v2, v3, v5}, Lo/startForeground;->IconCompatParcelizer(CII)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    sget-object v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$d:[B

    const/16 v5, 0xd

    aget-byte v5, v3, v5

    neg-int v5, v5

    int-to-byte v5, v5

    const/4 v8, 0x7

    aget-byte v3, v3, v8

    int-to-byte v3, v3

    or-int/lit8 v8, v3, 0x17

    int-to-byte v8, v8

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v5, v3, v8, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->d(BBS[Ljava/lang/Object;)V

    aget-object v3, v11, v4

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x5

    new-array v8, v5, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v10, 0x1

    aput-object v5, v8, v10

    const-class v5, Ljava/util/List;

    const/4 v10, 0x2

    aput-object v5, v8, v10

    const-class v5, Ljava/lang/String;

    const/4 v10, 0x3

    aput-object v5, v8, v10

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v10, 0x4

    aput-object v5, v8, v10

    invoke-virtual {v2, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a2b
    .catchall {:try_start_9af .. :try_end_a2b} :catchall_14aa

    goto/16 :goto_8f1

    :goto_a2d
    if-eqz v1, :cond_a48

    .line 407
    :try_start_a2f
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_a3f

    .line 414
    move-object v2, v1

    check-cast v2, Landroid/content/ContextWrapper;

    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_a3d

    goto :goto_a3f

    :cond_a3d
    const/4 v1, 0x0

    goto :goto_a48

    .line 423
    :cond_a3f
    :goto_a3f
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1
    :try_end_a43
    .catchall {:try_start_a2f .. :try_end_a43} :catchall_a44

    goto :goto_a48

    :catchall_a44
    move-exception v0

    move-object v1, v0

    goto/16 :goto_b2e

    :cond_a48
    :goto_a48
    const/4 v2, 0x1

    .line 433
    :try_start_a49
    new-array v3, v2, [Ljava/lang/Object;

    const v2, 0x298664b5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const v2, -0x4342289e

    invoke-static {v2}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_a90

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v7

    const-wide/16 v10, 0x0

    cmp-long v2, v7, v10

    const/4 v5, 0x1

    rsub-int/lit8 v2, v2, 0x1

    int-to-char v2, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v5

    const/16 v7, 0x10

    shr-int/2addr v5, v7

    add-int/lit16 v5, v5, 0x7c7

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v7

    add-int/lit8 v33, v7, 0xc

    const v34, -0x3d0bec09

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/4 v7, 0x1

    new-array v8, v7, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v8, v4

    move/from16 v31, v2

    move/from16 v32, v5

    move-object/from16 v37, v8

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    :cond_a90
    check-cast v2, Ljava/lang/reflect/Constructor;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_a96
    .catchall {:try_start_a49 .. :try_end_a96} :catchall_b24

    :try_start_a96
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x1509fb02

    invoke-static {v2}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_b12

    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v2

    const-wide/16 v7, 0x0

    cmp-long v2, v2, v7

    rsub-int v2, v2, 0x4b7a

    int-to-char v2, v2

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v3

    rsub-int v3, v3, 0xac7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v10

    cmp-long v5, v10, v7

    add-int/lit8 v33, v5, 0x62

    const v34, 0x6b403f97

    const/16 v35, 0x0

    sget-object v5, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v7, 0x64

    aget-byte v7, v5, v7

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    int-to-short v7, v7

    const/4 v10, 0x7

    aget-byte v11, v5, v10

    sub-int/2addr v11, v8

    int-to-byte v10, v11

    const/16 v11, 0x94

    aget-byte v5, v5, v11

    int-to-byte v5, v5

    new-array v11, v8, [Ljava/lang/Object;

    invoke-static {v7, v10, v5, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v5, v11, v4

    move-object/from16 v36, v5

    check-cast v36, Ljava/lang/String;

    const/4 v5, 0x2

    new-array v7, v5, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    aput-object v5, v7, v4

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v5

    const/4 v8, 0x0

    cmpl-float v5, v5, v8

    add-int/lit16 v5, v5, 0x256b

    int-to-char v5, v5

    invoke-static {v4, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    add-int/lit16 v8, v8, 0xd76

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v10

    const/16 v11, 0x8

    shr-int/2addr v10, v11

    rsub-int v10, v10, 0x90

    invoke-static {v5, v8, v10}, Lo/startForeground;->IconCompatParcelizer(CII)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    const/4 v8, 0x1

    aput-object v5, v7, v8

    move/from16 v31, v2

    move/from16 v32, v3

    move-object/from16 v37, v7

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    :cond_b12
    check-cast v2, Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b18
    .catchall {:try_start_a96 .. :try_end_b18} :catchall_b1a

    goto/16 :goto_c48

    :catchall_b1a
    move-exception v0

    move-object v1, v0

    :try_start_b1c
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_b23

    throw v2

    :cond_b23
    throw v1

    :catchall_b24
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_b2d

    throw v2

    :cond_b2d
    throw v1
    :try_end_b2e
    .catchall {:try_start_b1c .. :try_end_b2e} :catchall_a44

    .line 438
    :goto_b2e
    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v9, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f130404

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    const v3, 0xd5ba

    add-int/2addr v2, v3

    const/16 v3, 0xb

    new-array v5, v3, [C

    fill-array-data v5, :array_16c8

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v5, v7}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v2, v7, v4

    check-cast v2, Ljava/lang/String;

    :try_start_b6d
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 445
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v5, Ljava/io/PrintStream;

    .line 456
    invoke-direct {v5, v3}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v1, v5}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V

    .line 460
    const-string v5, "UTF-8"

    invoke-virtual {v3, v5}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_b83
    .catchall {:try_start_b6d .. :try_end_b83} :catchall_b84

    goto :goto_b88

    .line 464
    :catchall_b84
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_b88
    new-instance v3, Ljava/util/ArrayList;

    const/4 v5, 0x2

    .line 466
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 468
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 484
    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const v1, -0x53de561a

    .line 499
    :try_start_b97
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_bc6

    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    rsub-int v1, v1, 0x11b7

    int-to-char v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v2

    const/16 v5, 0x10

    shr-int/2addr v2, v5

    rsub-int v2, v2, 0x17a6

    invoke-static {v15}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v5

    rsub-int/lit8 v33, v5, 0x2a

    const v34, -0x2d97928d

    const/16 v35, 0x0

    const-string v36, "IconCompatParcelizer"

    new-array v5, v4, [Ljava/lang/Class;

    move/from16 v31, v1

    move/from16 v32, v2

    move-object/from16 v37, v5

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_bc6
    check-cast v1, Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_bcd
    .catchall {:try_start_b97 .. :try_end_bcd} :catchall_357

    .line 509
    invoke-static {}, Lcom/marrow/TrainingApplication;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x5

    .line 513
    :try_start_bd2
    new-array v7, v5, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v8, 0x4

    aput-object v5, v7, v8

    const/4 v5, 0x3

    aput-object v2, v7, v5

    const/4 v2, 0x2

    aput-object v3, v7, v2

    const-wide v2, 0x1300000001L

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v7, v3

    const v2, 0x298664b5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v7, v4

    invoke-static {v15, v4}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v2

    int-to-char v2, v2

    invoke-static {v4, v4, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v3

    add-int/lit16 v3, v3, 0x178e

    invoke-static {v15}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x17

    invoke-static {v2, v3, v5}, Lo/startForeground;->IconCompatParcelizer(CII)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    sget-object v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$d:[B

    const/16 v5, 0xd

    aget-byte v5, v3, v5

    neg-int v5, v5

    int-to-byte v5, v5

    const/4 v8, 0x7

    aget-byte v3, v3, v8

    int-to-byte v3, v3

    or-int/lit8 v8, v3, 0x17

    int-to-byte v8, v8

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v5, v3, v8, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->d(BBS[Ljava/lang/Object;)V

    aget-object v3, v11, v4

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x5

    new-array v8, v5, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v10, 0x1

    aput-object v5, v8, v10

    const-class v5, Ljava/util/List;

    const/4 v10, 0x2

    aput-object v5, v8, v10

    const-class v5, Ljava/lang/String;

    const/4 v10, 0x3

    aput-object v5, v8, v10

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v10, 0x4

    aput-object v5, v8, v10

    invoke-virtual {v2, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c48
    .catchall {:try_start_bd2 .. :try_end_c48} :catchall_14aa

    :goto_c48
    const v1, -0x79bdc3b3

    .line 517
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_c90

    invoke-static {v4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v1

    rsub-int v1, v1, 0x337f

    int-to-char v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v2

    const/16 v3, 0x10

    shr-int/2addr v2, v3

    add-int/lit16 v2, v2, 0x671

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v5

    shr-int/2addr v5, v3

    rsub-int/lit8 v33, v5, 0x1a

    const v34, -0x7f40728

    const/16 v35, 0x0

    const/16 v3, 0x4d

    int-to-short v3, v3

    const/16 v5, 0x28

    int-to-byte v5, v5

    sget-object v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v8, 0x8c

    aget-byte v7, v7, v8

    int-to-byte v7, v7

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    invoke-static {v3, v5, v7, v10}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v3, v10, v4

    move-object/from16 v36, v3

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v1

    move/from16 v32, v2

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_c90
    check-cast v1, Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v7

    const-wide/16 v1, -0x1

    cmp-long v1, v7, v1

    if-eqz v1, :cond_cf0

    const v1, -0x43d47fd9

    .line 523
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_ce4

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    rsub-int v1, v1, 0x337f

    int-to-char v1, v1

    invoke-static {v15, v15, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v2

    add-int/lit16 v2, v2, 0x671

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v3

    add-int/lit8 v33, v3, 0x1a

    const v34, -0x3d9dbb4e

    const/16 v35, 0x0

    const/16 v3, 0x78

    int-to-short v3, v3

    sget-object v5, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v7, 0xb

    aget-byte v7, v5, v7

    neg-int v7, v7

    int-to-byte v7, v7

    aget-byte v5, v5, v6

    int-to-byte v5, v5

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    invoke-static {v3, v7, v5, v10}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v3, v10, v4

    move-object/from16 v36, v3

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v1

    move/from16 v32, v2

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_ce4
    check-cast v1, Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    :goto_ced
    const/4 v2, 0x3

    goto/16 :goto_f89

    :cond_cf0
    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 530
    new-array v3, v1, [C

    fill-array-data v3, :array_16d8

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v1, v9, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const v2, 0xa55f

    add-int/2addr v1, v2

    int-to-char v1, v1

    const/4 v2, 0x4

    new-array v5, v2, [C

    fill-array-data v5, :array_16e0

    const/16 v2, 0x10

    new-array v7, v2, [C

    fill-array-data v7, :array_16e8

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v8

    shr-int/lit8 v35, v8, 0x10

    const/4 v2, 0x1

    new-array v8, v2, [Ljava/lang/Object;

    move-object/from16 v31, v3

    move/from16 v32, v1

    move-object/from16 v33, v5

    move-object/from16 v34, v7

    move-object/from16 v36, v8

    invoke-static/range {v31 .. v36}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v1, v8, v4

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v9, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    add-int/lit16 v2, v2, 0x4992

    const/16 v3, 0x10

    new-array v5, v3, [C

    fill-array-data v5, :array_16fc

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v5, v7}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v2, v7, v4

    check-cast v2, Ljava/lang/String;

    .line 549
    const-class v3, Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    .line 557
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 568
    filled-new-array/range {p0 .. p0}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x3

    .line 576
    :try_start_d8b
    new-array v3, v2, [Ljava/lang/Object;

    const v2, -0x5281ea11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v3, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v3, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v4

    sget-object v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$d:[B

    const/16 v2, 0x1d

    aget-byte v2, v1, v2

    neg-int v2, v2

    int-to-byte v2, v2

    const/16 v5, 0xa

    aget-byte v5, v1, v5

    int-to-byte v5, v5

    const/16 v7, 0xd

    aget-byte v7, v1, v7

    int-to-byte v7, v7

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    invoke-static {v2, v5, v7, v10}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->d(BBS[Ljava/lang/Object;)V

    aget-object v2, v10, v4

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v5, 0x1f

    int-to-byte v5, v5

    const/16 v7, 0x25

    int-to-byte v7, v7

    const/4 v8, 0x7

    aget-byte v1, v1, v8

    int-to-byte v1, v1

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    invoke-static {v5, v7, v1, v10}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->d(BBS[Ljava/lang/Object;)V

    aget-object v1, v10, v4

    check-cast v1, Ljava/lang/String;

    const/4 v5, 0x3

    new-array v7, v5, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v7, v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x1

    aput-object v5, v7, v8

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x2

    aput-object v5, v7, v8

    invoke-virtual {v2, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;
    :try_end_df4
    .catchall {:try_start_d8b .. :try_end_df4} :catchall_14a0

    const v2, -0x43d47fd9

    .line 578
    invoke-static {v2}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_e3f

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v2

    const/16 v3, 0x10

    shr-int/2addr v2, v3

    add-int/lit16 v2, v2, 0x337f

    int-to-char v2, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v5

    shr-int/2addr v5, v3

    rsub-int v3, v5, 0x671

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v5

    shr-int/lit8 v5, v5, 0x18

    add-int/lit8 v33, v5, 0x1a

    const v34, -0x3d9dbb4e

    const/16 v35, 0x0

    const/16 v5, 0x78

    int-to-short v5, v5

    sget-object v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v8, 0xb

    aget-byte v10, v7, v8

    neg-int v8, v10

    int-to-byte v8, v8

    aget-byte v7, v7, v6

    int-to-byte v7, v7

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v5, v8, v7, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v5, v11, v4

    move-object/from16 v36, v5

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v2

    move/from16 v32, v3

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    :cond_e3f
    check-cast v2, Ljava/lang/reflect/Field;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x4

    :try_start_e46
    new-array v3, v2, [C

    fill-array-data v3, :array_1710

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v9, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v5, 0x0

    move-object v8, v5

    check-cast v8, [Ljava/lang/Object;

    invoke-virtual {v2, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x5

    invoke-virtual {v2, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    add-int/lit8 v2, v2, -0x61

    int-to-char v2, v2

    const/4 v5, 0x4

    new-array v7, v5, [C

    fill-array-data v7, :array_1718

    const/16 v5, 0x16

    new-array v5, v5, [C

    fill-array-data v5, :array_1720

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    new-array v10, v4, [Ljava/lang/Class;

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const/4 v10, 0x0

    move-object v11, v10

    check-cast v11, [Ljava/lang/Object;

    invoke-virtual {v8, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v8

    iget v8, v8, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    add-int/lit8 v35, v8, -0x23

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    move-object/from16 v31, v3

    move/from16 v32, v2

    move-object/from16 v33, v7

    move-object/from16 v34, v5

    move-object/from16 v36, v10

    invoke-static/range {v31 .. v36}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v2, v10, v4

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 586
    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    move-result-wide v7

    const-wide/16 v10, 0x0

    cmp-long v3, v7, v10

    rsub-int v3, v3, 0x1a3e

    const/16 v5, 0xf

    new-array v5, v5, [C

    fill-array-data v5, :array_173a

    const/4 v7, 0x1

    new-array v8, v7, [Ljava/lang/Object;

    invoke-static {v3, v5, v8}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v3, v8, v4

    check-cast v3, Ljava/lang/String;

    .line 587
    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 592
    invoke-virtual {v2, v5, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2
    :try_end_ee2
    .catch Ljava/lang/Exception; {:try_start_e46 .. :try_end_ee2} :catch_149a

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const v7, 0x7d74936c

    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_f2e

    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    add-int/lit16 v7, v7, 0x337f

    int-to-char v7, v7

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v8

    rsub-int v8, v8, 0x671

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v10

    const/16 v11, 0x10

    shr-int/2addr v10, v11

    rsub-int/lit8 v33, v10, 0x1a

    const v34, 0x33d57f9

    const/16 v35, 0x0

    const/16 v10, 0x99

    int-to-short v10, v10

    sget-object v11, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v12, 0xb

    aget-byte v12, v11, v12

    neg-int v12, v12

    int-to-byte v12, v12

    aget-byte v11, v11, v6

    int-to-byte v11, v11

    const/4 v13, 0x1

    new-array v14, v13, [Ljava/lang/Object;

    invoke-static {v10, v12, v11, v14}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v10, v14, v4

    move-object/from16 v36, v10

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v7

    move/from16 v32, v8

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_f2e
    check-cast v7, Ljava/lang/reflect/Field;

    const/4 v8, 0x0

    invoke-virtual {v7, v8, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    shr-long/2addr v2, v6

    .line 601
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const v3, -0x79bdc3b3

    invoke-static {v3}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_f81

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v7

    const-wide/16 v10, -0x1

    cmp-long v3, v7, v10

    add-int/lit16 v3, v3, 0x337e

    int-to-char v3, v3

    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v5

    rsub-int v5, v5, 0x671

    invoke-static {v15, v15}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v7

    rsub-int/lit8 v33, v7, 0x1a

    const v34, -0x7f40728

    const/16 v35, 0x0

    const/16 v7, 0x4d

    int-to-short v7, v7

    const/16 v8, 0x28

    int-to-byte v8, v8

    sget-object v10, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v11, 0x8c

    aget-byte v10, v10, v11

    int-to-byte v10, v10

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v7, v8, v10, v12}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v7, v12, v4

    move-object/from16 v36, v7

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v3

    move/from16 v32, v5

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    :cond_f81
    check-cast v3, Ljava/lang/reflect/Field;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_ced

    .line 607
    :goto_f89
    aget-object v3, v1, v2

    check-cast v3, [I

    aget v2, v3, v4

    const/4 v3, 0x2

    .line 610
    aget-object v1, v1, v3

    check-cast v1, [I

    aget v1, v1, v4

    if-eq v1, v2, :cond_1077

    xor-int/2addr v1, v2

    int-to-long v1, v1

    int-to-long v7, v4

    const/16 v3, 0x20

    shl-long/2addr v7, v3

    const/4 v5, -0x1

    int-to-long v10, v5

    const/16 v5, 0x3f

    shr-long v12, v10, v5

    shl-long/2addr v12, v3

    sub-long/2addr v10, v12

    or-long/2addr v7, v10

    and-long/2addr v1, v7

    const/4 v5, 0x2

    int-to-long v7, v5

    shl-long/2addr v7, v3

    int-to-long v10, v4

    const/16 v5, 0x3f

    shr-long v12, v10, v5

    shl-long/2addr v12, v3

    sub-long/2addr v10, v12

    or-long/2addr v7, v10

    or-long/2addr v1, v7

    const v3, -0x53de561a

    .line 629
    :try_start_fb7
    invoke-static {v3}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_fee

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v7

    const-wide/16 v10, 0x0

    cmp-long v3, v7, v10

    rsub-int v3, v3, 0x11b8

    int-to-char v3, v3

    const/4 v5, 0x0

    invoke-static {v5, v5}, Landroid/graphics/PointF;->length(FF)F

    move-result v7

    cmpl-float v7, v7, v5

    rsub-int v5, v7, 0x17a6

    invoke-static {v4}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x14

    const/4 v8, 0x6

    shr-int/2addr v7, v8

    rsub-int/lit8 v33, v7, 0x2a

    const v34, -0x2d97928d

    const/16 v35, 0x0

    const-string v36, "IconCompatParcelizer"

    new-array v7, v4, [Ljava/lang/Class;

    move/from16 v31, v3

    move/from16 v32, v5

    move-object/from16 v37, v7

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    :cond_fee
    check-cast v3, Ljava/lang/reflect/Method;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_ff5
    .catchall {:try_start_fb7 .. :try_end_ff5} :catchall_357

    .line 634
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/marrow/TrainingApplication;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x5

    .line 644
    :try_start_fff
    new-array v10, v8, [Ljava/lang/Object;

    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    const/4 v12, 0x4

    aput-object v11, v10, v12

    const/4 v11, 0x3

    aput-object v7, v10, v11

    const/4 v7, 0x2

    aput-object v5, v10, v7

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v10, v8

    const v1, 0x298664b5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v10, v4

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    const/high16 v2, -0x1000000

    sub-int/2addr v2, v1

    int-to-char v1, v2

    invoke-static {v4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v7

    const-wide/16 v11, 0x0

    cmp-long v2, v7, v11

    add-int/lit16 v2, v2, 0x178e

    invoke-static {v11, v12}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v5

    add-int/lit8 v5, v5, 0x19

    invoke-static {v1, v2, v5}, Lo/startForeground;->IconCompatParcelizer(CII)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    sget-object v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$d:[B

    const/16 v5, 0xd

    aget-byte v5, v2, v5

    neg-int v5, v5

    int-to-byte v5, v5

    const/4 v7, 0x7

    aget-byte v2, v2, v7

    int-to-byte v2, v2

    or-int/lit8 v7, v2, 0x17

    int-to-byte v7, v7

    const/4 v8, 0x1

    new-array v11, v8, [Ljava/lang/Object;

    invoke-static {v5, v2, v7, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->d(BBS[Ljava/lang/Object;)V

    aget-object v2, v11, v4

    check-cast v2, Ljava/lang/String;

    const/4 v5, 0x5

    new-array v7, v5, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v7, v4

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x1

    aput-object v5, v7, v8

    const-class v5, Ljava/util/List;

    const/4 v8, 0x2

    aput-object v5, v7, v8

    const-class v5, Ljava/lang/String;

    const/4 v8, 0x3

    aput-object v5, v7, v8

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x4

    aput-object v5, v7, v8

    invoke-virtual {v1, v2, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1077
    .catchall {:try_start_fff .. :try_end_1077} :catchall_14aa

    :cond_1077
    const v1, -0x77bed5e1

    .line 654
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_10c0

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v1

    const/16 v2, 0x10

    shr-int/2addr v1, v2

    int-to-char v1, v1

    invoke-static {v15}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v2

    add-int/lit16 v2, v2, 0x3b0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v7

    const-wide/16 v10, 0x0

    cmp-long v3, v7, v10

    add-int/lit8 v33, v3, 0x23

    const v34, -0x9f71176

    const/16 v35, 0x0

    sget-object v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v5, 0x14

    aget-byte v5, v3, v5

    int-to-short v5, v5

    const/16 v7, 0x8

    aget-byte v3, v3, v7

    int-to-byte v3, v3

    int-to-byte v7, v3

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    invoke-static {v5, v3, v7, v10}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v3, v10, v4

    move-object/from16 v36, v3

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v1

    move/from16 v32, v2

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_10c0
    check-cast v1, Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v7

    const-wide/16 v1, -0x1

    cmp-long v1, v7, v1

    if-eqz v1, :cond_112b

    .line 290
    sget v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    const/4 v2, 0x2

    rem-int/2addr v1, v2

    const v1, -0x2d293a4f

    .line 658
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_111f

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v1

    const/16 v2, 0x10

    shr-int/2addr v1, v2

    int-to-char v5, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v1

    const/16 v2, 0x8

    shr-int/2addr v1, v2

    add-int/lit16 v6, v1, 0x3af

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v1

    rsub-int/lit8 v7, v1, 0x23

    const v8, -0x5360fedc

    const/4 v9, 0x0

    sget-object v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v2, 0x66

    aget-byte v2, v1, v2

    int-to-short v2, v2

    const/16 v3, 0x1c

    aget-byte v3, v1, v3

    neg-int v3, v3

    int-to-byte v3, v3

    const/16 v10, 0x8c

    aget-byte v1, v1, v10

    int-to-byte v1, v1

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v2, v3, v1, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v1, v11, v4

    move-object v10, v1

    check-cast v10, Ljava/lang/String;

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_111f
    check-cast v1, Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    :goto_1128
    const/4 v2, 0x2

    goto/16 :goto_13b6

    :cond_112b
    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 669
    new-array v3, v1, [C

    fill-array-data v3, :array_174e

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v1, v9, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/String;->codePointAt(I)I

    move-result v1

    const v2, 0xa506

    add-int/2addr v1, v2

    int-to-char v1, v1

    const/4 v2, 0x4

    new-array v5, v2, [C

    fill-array-data v5, :array_1756

    const/16 v2, 0x10

    new-array v7, v2, [C

    fill-array-data v7, :array_175e

    invoke-static {v4, v4}, Landroid/view/View;->getDefaultSize(II)I

    move-result v35

    const/4 v2, 0x1

    new-array v8, v2, [Ljava/lang/Object;

    move-object/from16 v31, v3

    move/from16 v32, v1

    move-object/from16 v33, v5

    move-object/from16 v34, v7

    move-object/from16 v36, v8

    invoke-static/range {v31 .. v36}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v1, v8, v4

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v9, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit16 v2, v2, 0x49ab

    const/16 v3, 0x10

    new-array v5, v3, [C

    fill-array-data v5, :array_1772

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v5, v7}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v2, v7, v4

    check-cast v2, Ljava/lang/String;

    .line 678
    const-class v3, Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 689
    filled-new-array/range {p0 .. p0}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x3

    .line 696
    :try_start_11c6
    new-array v3, v2, [Ljava/lang/Object;

    const v2, -0x20625414

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v3, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v3, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v4

    const v1, -0x14359e5

    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_123b

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v1

    const/16 v2, 0x8

    shr-int/2addr v1, v2

    int-to-char v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v2

    const/4 v5, 0x0

    cmpl-float v2, v2, v5

    add-int/lit16 v2, v2, 0x3ae

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v5

    const/16 v7, 0x10

    shr-int/2addr v5, v7

    rsub-int/lit8 v33, v5, 0x24

    const v34, -0x7f0a9d72

    const/16 v35, 0x0

    const/16 v5, 0xba

    int-to-short v5, v5

    sget-object v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v8, 0x24

    aget-byte v8, v7, v8

    int-to-byte v8, v8

    aget-byte v7, v7, v6

    int-to-byte v7, v7

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v5, v8, v7, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v5, v11, v4

    move-object/from16 v36, v5

    check-cast v36, Ljava/lang/String;

    const/4 v5, 0x3

    new-array v7, v5, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v7, v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x1

    aput-object v5, v7, v8

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x2

    aput-object v5, v7, v8

    move/from16 v31, v1

    move/from16 v32, v2

    move-object/from16 v37, v7

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_123b
    check-cast v1, Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;
    :try_end_1244
    .catchall {:try_start_11c6 .. :try_end_1244} :catchall_357

    const v2, -0x2d293a4f

    invoke-static {v2}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1292

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v2

    const-wide/16 v7, 0x0

    cmp-long v2, v2, v7

    const/4 v3, 0x1

    rsub-int/lit8 v2, v2, 0x1

    int-to-char v2, v2

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v3

    add-int/lit16 v3, v3, 0x3af

    invoke-static {v15, v15}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v5

    add-int/lit8 v33, v5, 0x24

    const v34, -0x5360fedc

    const/16 v35, 0x0

    sget-object v5, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v7, 0x66

    aget-byte v7, v5, v7

    int-to-short v7, v7

    const/16 v8, 0x1c

    aget-byte v8, v5, v8

    neg-int v8, v8

    int-to-byte v8, v8

    const/16 v10, 0x8c

    aget-byte v5, v5, v10

    int-to-byte v5, v5

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v7, v8, v5, v11}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v5, v11, v4

    move-object/from16 v36, v5

    check-cast v36, Ljava/lang/String;

    const/16 v37, 0x0

    move/from16 v31, v2

    move/from16 v32, v3

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    :cond_1292
    check-cast v2, Ljava/lang/reflect/Field;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x4

    :try_start_1299
    new-array v3, v2, [C

    fill-array-data v3, :array_1786

    const/16 v5, 0x30

    invoke-static {v15, v5, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v5

    rsub-int/lit8 v5, v5, -0x1

    int-to-char v5, v5

    new-array v7, v2, [C

    fill-array-data v7, :array_178e

    const/16 v2, 0x16

    new-array v2, v2, [C

    fill-array-data v2, :array_1796

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v8

    const/16 v10, 0x10

    shr-int/lit8 v35, v8, 0x10

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    move-object/from16 v31, v3

    move/from16 v32, v5

    move-object/from16 v33, v7

    move-object/from16 v34, v2

    move-object/from16 v36, v10

    invoke-static/range {v31 .. v36}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->b([CC[C[CI[Ljava/lang/Object;)V

    aget-object v2, v10, v4

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-static/range {v30 .. v30}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v3, v9, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v5, 0x0

    move-object v8, v5

    check-cast v8, [Ljava/lang/Object;

    invoke-virtual {v3, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    add-int/lit16 v3, v3, 0x1a1c

    const/16 v5, 0xf

    new-array v5, v5, [C

    fill-array-data v5, :array_17b0

    const/4 v7, 0x1

    new-array v8, v7, [Ljava/lang/Object;

    invoke-static {v3, v5, v8}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->a(I[C[Ljava/lang/Object;)V

    aget-object v3, v8, v4

    check-cast v3, Ljava/lang/String;

    .line 701
    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 706
    new-array v3, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2
    :try_end_1317
    .catch Ljava/lang/Exception; {:try_start_1299 .. :try_end_1317} :catch_1494

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const v7, -0x5bc50452

    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_1363

    invoke-static {v15}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v7

    int-to-char v8, v7

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v7

    shr-int/lit8 v7, v7, 0x16

    add-int/lit16 v9, v7, 0x3af

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v7

    const/16 v10, 0x10

    shr-int/2addr v7, v10

    add-int/lit8 v10, v7, 0x24

    const v11, -0x258cc0c5

    sget-object v7, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v13, 0x64

    aget-byte v13, v7, v13

    const/4 v14, 0x1

    sub-int/2addr v13, v14

    int-to-short v13, v13

    const/16 v16, 0x7

    aget-byte v17, v7, v16

    add-int/lit8 v6, v17, -0x1

    int-to-byte v6, v6

    const/16 v17, 0x94

    aget-byte v7, v7, v17

    int-to-byte v7, v7

    new-array v12, v14, [Ljava/lang/Object;

    invoke-static {v13, v6, v7, v12}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v6, v12, v4

    move-object v13, v6

    check-cast v13, Ljava/lang/String;

    const/4 v14, 0x0

    const/4 v6, 0x0

    move v12, v6

    invoke-static/range {v8 .. v14}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_1363
    check-cast v7, Ljava/lang/reflect/Field;

    const/4 v6, 0x0

    invoke-virtual {v7, v6, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v5, 0xc

    shr-long/2addr v2, v5

    .line 724
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const v3, -0x77bed5e1

    invoke-static {v3}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_13ae

    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v3

    int-to-char v5, v3

    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v3

    const/4 v6, 0x0

    cmpl-float v3, v3, v6

    rsub-int v6, v3, 0x3af

    invoke-static {v15, v15, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v3

    rsub-int/lit8 v7, v3, 0x24

    const v8, -0x9f71176

    const/4 v9, 0x0

    sget-object v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$a:[B

    const/16 v10, 0x14

    aget-byte v10, v3, v10

    int-to-short v10, v10

    const/16 v11, 0x8

    aget-byte v3, v3, v11

    int-to-byte v3, v3

    int-to-byte v11, v3

    const/4 v12, 0x1

    new-array v13, v12, [Ljava/lang/Object;

    invoke-static {v10, v3, v11, v13}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->c(SBB[Ljava/lang/Object;)V

    aget-object v3, v13, v4

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    :cond_13ae
    check-cast v3, Ljava/lang/reflect/Field;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1128

    .line 732
    :goto_13b6
    aget-object v3, v1, v2

    check-cast v3, [I

    aget v2, v3, v4

    .line 741
    aget-object v1, v1, v4

    check-cast v1, [I

    aget v1, v1, v4

    if-eq v1, v2, :cond_1493

    xor-int/2addr v1, v2

    int-to-long v1, v1

    int-to-long v5, v4

    const/16 v3, 0x20

    shl-long/2addr v5, v3

    const/4 v7, -0x1

    int-to-long v7, v7

    const/16 v9, 0x3f

    shr-long v9, v7, v9

    shl-long/2addr v9, v3

    sub-long/2addr v7, v9

    or-long/2addr v5, v7

    and-long/2addr v1, v5

    const/4 v5, 0x1

    int-to-long v6, v5

    shl-long v5, v6, v3

    int-to-long v7, v4

    const/16 v9, 0x3f

    shr-long v9, v7, v9

    shl-long/2addr v9, v3

    sub-long/2addr v7, v9

    or-long/2addr v5, v7

    or-long/2addr v1, v5

    const v3, -0x53de561a

    .line 763
    :try_start_13e4
    invoke-static {v3}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_140c

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v3

    add-int/lit16 v3, v3, 0x11b7

    int-to-char v5, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v3

    const/16 v6, 0x10

    shr-int/2addr v3, v6

    add-int/lit16 v6, v3, 0x17a6

    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    rsub-int/lit8 v7, v3, 0x2a

    const v8, -0x2d97928d

    const/4 v9, 0x0

    const-string v10, "IconCompatParcelizer"

    new-array v11, v4, [Ljava/lang/Class;

    invoke-static/range {v5 .. v11}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    :cond_140c
    check-cast v3, Ljava/lang/reflect/Method;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1413
    .catchall {:try_start_13e4 .. :try_end_1413} :catchall_357

    .line 772
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/marrow/TrainingApplication;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x5

    .line 781
    :try_start_141d
    new-array v8, v7, [Ljava/lang/Object;

    const/4 v7, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/4 v10, 0x4

    aput-object v9, v8, v10

    const/4 v9, 0x3

    aput-object v6, v8, v9

    const/4 v6, 0x2

    aput-object v5, v8, v6

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v8, v7

    const v1, 0x298664b5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v8, v4

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    const/high16 v2, -0x1000000

    sub-int/2addr v2, v1

    int-to-char v1, v2

    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v2

    rsub-int v2, v2, 0x178e

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v5

    shr-int/lit8 v5, v5, 0x16

    rsub-int/lit8 v5, v5, 0x18

    invoke-static {v1, v2, v5}, Lo/startForeground;->IconCompatParcelizer(CII)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    sget-object v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->$$d:[B

    const/16 v5, 0xd

    aget-byte v5, v2, v5

    neg-int v5, v5

    int-to-byte v5, v5

    const/4 v6, 0x7

    aget-byte v2, v2, v6

    int-to-byte v2, v2

    or-int/lit8 v6, v2, 0x17

    int-to-byte v6, v6

    const/4 v7, 0x1

    new-array v9, v7, [Ljava/lang/Object;

    invoke-static {v5, v2, v6, v9}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->d(BBS[Ljava/lang/Object;)V

    aget-object v2, v9, v4

    check-cast v2, Ljava/lang/String;

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v4

    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x1

    aput-object v4, v5, v6

    const-class v4, Ljava/util/List;

    const/4 v6, 0x2

    aput-object v4, v5, v6

    const-class v4, Ljava/lang/String;

    const/4 v6, 0x3

    aput-object v4, v5, v6

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x4

    aput-object v4, v5, v6

    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1493
    .catchall {:try_start_141d .. :try_end_1493} :catchall_14aa

    :cond_1493
    return-void

    .line 724
    :catch_1494
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 601
    :catch_149a
    new-instance v1, Ljava/lang/RuntimeException;

    .line 606
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :catchall_14a0
    move-exception v0

    move-object v1, v0

    .line 576
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_14a9

    throw v2

    :cond_14a9
    throw v1

    :catchall_14aa
    move-exception v0

    move-object v1, v0

    .line 385
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_14b3

    throw v2

    :cond_14b3
    throw v1

    .line 188
    :goto_14b4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_14bb

    throw v2

    :cond_14bb
    throw v1

    :array_14bc
    .array-data 2
        0x6f70s
        -0x513es
        -0x13f1s
        0x2a54s
        0x698as
        -0x5837s
        -0x1ae5s
        0x2314s
        0x6296s
        -0x5f39s
        -0x1a3s
        0x3c5es
        0x7bbfs
        -0x4619s
        -0x8dcs
        0x3567s
        0x74b2s
        -0x4d11s
    .end array-data

    :array_14d2
    .array-data 2
        0x6f7cs
        0x136fs
        -0x68b6s
        0x1b6ds
        -0x6097s
    .end array-data

    nop

    :array_14dc
    .array-data 2
        0x6f72s
        0x2357s
        -0x839s
        -0x75d2s
        0x5ebes
        0x114as
        -0x5a3es
        0x7856s
        0xcbds
        -0x20d4s
        -0x6ca4s
        0x27d9s
        -0x5f0s
        -0x7160s
        0x413fs
        0x1599s
        -0x57efs
        0x7cd7s
        0xf64s
        -0x3c58s
        -0x6822s
        0x2a1bs
        -0x16bs
        -0x4e83s
        0x45e1s
        0x184cs
        -0x5375s
        0x7f51s
        0x33b6s
        -0x39d9s
        -0x65a7s
        0x2eccs
        -0x1eecs
        -0x4a10s
        0x4861s
        0x1ccds
        -0x50a1s
        0x63eds
        0x3661s
        -0x355ds
        -0x6173s
        0x5149s
        -0x1a0as
        -0x478bs
        0x4ceds
        0x1f1fs
        -0x2c23s
        0x6669s
    .end array-data

    :array_1510
    .array-data 2
        0x6f21s
        -0x48ebs
        -0x2044s
        -0x19ecs
        0xebas
        0x5573s
        0x7d4cs
        -0x7a0as
        -0x53e4s
        -0xb47s
        0x1b73s
        0x231es
        0x4bf5s
        -0x6de5s
        -0x4529s
        -0x3ed2s
        -0x1700s
        0x31a3s
        0x584es
        0x608ds
        -0x78d5s
        -0x50a6s
        -0x801s
        0x1e69s
        0x26dbs
        0x4d2fs
        -0x6aaas
        -0x4204s
        -0x3b94s
        -0x1373s
        0x3331s
        0x5b58s
        0x63c1s
        -0x759es
        -0x2d23s
        -0x6c9s
        0x10bs
        0x29c0s
        0x7068s
        -0x6770s
        -0x40cfs
        -0x38a7s
        -0x106bs
        0x3638s
        0x5ec1s
        0x656cs
        -0x725es
        -0x2a64s
        -0x38fs
        0x49fs
        0x2b3as
        0x73a4s
        -0x6434s
        -0x5d85s
        -0x3561s
        0x1105s
        0x39a1s
        0x4198s
        0x6822s
        -0x4f31s
        -0x2900s
        -0x1s
        0x7d0s
        0x2e7fs
    .end array-data

    :array_1554
    .array-data 2
        0x6f73s
        -0x1351s
        0x686es
        -0x1a28s
        0x611cs
        -0x118s
        0x7a28s
        -0x840s
        0x730ds
        -0x308es
        0x4cb2s
        -0x37fbs
        0x459ds
        -0x3ecds
        0x5ea7s
        -0x25ecs
        0x57d9s
        -0x2cf1s
        0x2f7ds
        -0x5343s
        0x280fs
        -0x5a65s
        0x2168s
        -0x4106s
        0x3a40s
        -0x487ds
        0x33f3s
        -0x70c3s
        0xc86s
        -0x77ecs
        0x5e2s
        -0x7e88s
        0x1ec5s
        -0x65e1s
        0x17d8s
        -0x6c07s
        -0x1094s
        0x6cdfs
        -0x17e8s
        0x65bes
        -0x1e88s
        0x7ec4s
        -0x5fes
        0x7624s
        -0xc1as
        0x4f00s
        -0x336ds
        0x4831s
        -0x3a0cs
        0x412as
        -0x2167s
        0x5a0ds
        -0x29d4s
        0x53bcs
        -0x50f8s
        0x2ccbs
        -0x5798s
        0x25a4s
        -0x5ebes
        0x3e86s
        -0x455ds
        0x3635s
        -0x4c7bs
        0xf18s
    .end array-data

    :array_1598
    .array-data 2
        0x5e7fs
        0x1658s
        0x79b4s
        -0x4922s
    .end array-data

    :array_15a0
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_15a8
    .array-data 2
        0x4ce0s
        -0x2d5ds
        0x6c64s
        0x8fbs
        0x29acs
        0x14e9s
        0x6a43s
        -0x25acs
        0xef4s
        -0x2b6cs
        0x5c39s
        -0xc6es
        0x5c5fs
        -0xdc2s
        -0x1323s
        -0x22dds
        0x271as
        0x422as
        0x1db8s
        -0x1243s
        -0x6786s
        0x7946s
        -0x7e74s
        -0x74bcs
        0x7817s
        0x7dcfs
        -0x1227s
        -0x58dbs
        0x5df3s
        0xc01s
        -0x14e3s
        -0xa19s
        -0x243bs
        -0x7e97s
        0x5906s
        -0x355cs
        0x4a22s
        0x6a4ds
        0x89bs
        0x4a57s
        0x7561s
        -0x4089s
        -0xb88s
        -0xe51s
        0x343s
        -0x3f11s
        -0x2668s
        -0x1414s
        0x3b8s
        0x5990s
        -0x64e4s
        -0xf20s
        -0x7bd4s
        -0x4fa2s
        -0x4ef8s
        0x43b4s
        0x189ds
        -0x24dbs
        -0x658bs
        0x3330s
        -0x93cs
        -0x16d8s
        -0x233ds
        0xf57s
        -0x3b1bs
        -0x11ccs
        0x20f8s
    .end array-data

    nop

    :array_15f0
    .array-data 2
        -0x1a38s
        0x560fs
        -0x37e1s
        -0x54ces
    .end array-data

    :array_15f8
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_1600
    .array-data 2
        -0x4905s
        -0x15c6s
        -0x1d6cs
        -0x229fs
        0xa24s
        0x7c37s
    .end array-data

    :array_160a
    .array-data 2
        0x6e33s
        0x2008s
        0x10a5s
        0x3f3bs
    .end array-data

    :array_1612
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_161a
    .array-data 2
        -0x1558s
        0x365bs
        -0x5b11s
        0x481cs
        -0x27das
        -0x2157s
        -0x411ds
        0x4ac8s
        0x14e2s
        -0x48f8s
        -0x47dcs
        0x41e2s
        -0x62c3s
        -0x3dd8s
        -0x4456s
        -0x249fs
        0xdas
        0x4afbs
        -0x4349s
        0x641ds
        0x3e36s
        0x5befs
        -0x13b9s
        0x1d1fs
        -0x3571s
        -0x19s
        0xd39s
        -0x1e6fs
        -0x7ba4s
        0x5bees
        -0x7466s
        -0x7f57s
        0xd5ds
        -0x6c1s
        -0x3192s
        0x4cabs
    .end array-data

    :array_1642
    .array-data 2
        0x41b7s
        -0x1e7bs
        0x698es
        -0x2f5bs
    .end array-data

    :array_164a
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_1652
    .array-data 2
        0x6518s
        -0x68ces
        -0x2d28s
        0x5d0cs
        0x793s
        0x4d6ds
        0x56e0s
        0x2978s
        0x7e86s
        0x7d85s
        -0x42e4s
        0x13c2s
        0x824s
        0x34cds
        -0x39cds
        0x1b02s
    .end array-data

    :array_1666
    .array-data 2
        0x6f78s
        0x26c0s
        -0x3e2s
        -0x4da0s
        0x49b1s
        0x1ff1s
        -0x2aa5s
        0x6c9bs
        0x22f1s
        -0x7d3s
        -0x7190s
        0x45bes
        0x1b2es
        -0x2eb1s
        0x6893s
        0x3eefs
    .end array-data

    :array_167a
    .array-data 2
        0x31c1s
        -0x62afs
        0x4b69s
        0xc87s
    .end array-data

    :array_1682
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_168a
    .array-data 2
        0x3ad1s
        -0x3efds
        -0x27f6s
        0x1e0es
        -0x4a80s
        0x7073s
        0x1304s
        -0x15cs
        -0x12b4s
        -0x7fccs
        -0xc18s
        -0x6bdfs
        0xac4s
        -0x6b76s
        0x612es
        -0x686s
        -0x6847s
        -0x6d5cs
        0x2247s
        0x452fs
        -0x797ds
        -0x7f73s
    .end array-data

    :array_16a4
    .array-data 2
        0x6f74s
        0x7542s
        0x5b0es
        0x21dcs
        0x79es
        -0x13b1s
        -0xdf1s
        -0x2706s
        -0x4174s
        -0x7cb9s
        0x690bs
        0x4fd0s
        0x558cs
        0x3a4fs
        0x6s
    .end array-data

    nop

    :array_16b8
    .array-data 2
        0x6f25s
        0x67b8s
        0x7e1es
        0x76f4s
        0x4d44s
        0x4420s
        0x5c84s
        0x531es
        0x2bf0s
        0x2254s
        0x392fs
    .end array-data

    nop

    :array_16c8
    .array-data 2
        0x6f29s
        -0x46f3s
        -0x3c83s
        -0x125as
        0x3791s
        0x41c3s
        0x6a28s
        -0x4bees
        -0x21b1s
        -0x174as
        0x32e7s
    .end array-data

    nop

    :array_16d8
    .array-data 2
        0x41b7s
        -0x1e7bs
        0x698es
        -0x2f5bs
    .end array-data

    :array_16e0
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_16e8
    .array-data 2
        0x6518s
        -0x68ces
        -0x2d28s
        0x5d0cs
        0x793s
        0x4d6ds
        0x56e0s
        0x2978s
        0x7e86s
        0x7d85s
        -0x42e4s
        0x13c2s
        0x824s
        0x34cds
        -0x39cds
        0x1b02s
    .end array-data

    :array_16fc
    .array-data 2
        0x6f78s
        0x26c0s
        -0x3e2s
        -0x4da0s
        0x49b1s
        0x1ff1s
        -0x2aa5s
        0x6c9bs
        0x22f1s
        -0x7d3s
        -0x7190s
        0x45bes
        0x1b2es
        -0x2eb1s
        0x6893s
        0x3eefs
    .end array-data

    :array_1710
    .array-data 2
        0x31c1s
        -0x62afs
        0x4b69s
        0xc87s
    .end array-data

    :array_1718
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_1720
    .array-data 2
        0x3ad1s
        -0x3efds
        -0x27f6s
        0x1e0es
        -0x4a80s
        0x7073s
        0x1304s
        -0x15cs
        -0x12b4s
        -0x7fccs
        -0xc18s
        -0x6bdfs
        0xac4s
        -0x6b76s
        0x612es
        -0x686s
        -0x6847s
        -0x6d5cs
        0x2247s
        0x452fs
        -0x797ds
        -0x7f73s
    .end array-data

    :array_173a
    .array-data 2
        0x6f74s
        0x7542s
        0x5b0es
        0x21dcs
        0x79es
        -0x13b1s
        -0xdf1s
        -0x2706s
        -0x4174s
        -0x7cb9s
        0x690bs
        0x4fd0s
        0x558cs
        0x3a4fs
        0x6s
    .end array-data

    nop

    :array_174e
    .array-data 2
        0x41b7s
        -0x1e7bs
        0x698es
        -0x2f5bs
    .end array-data

    :array_1756
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_175e
    .array-data 2
        0x6518s
        -0x68ces
        -0x2d28s
        0x5d0cs
        0x793s
        0x4d6ds
        0x56e0s
        0x2978s
        0x7e86s
        0x7d85s
        -0x42e4s
        0x13c2s
        0x824s
        0x34cds
        -0x39cds
        0x1b02s
    .end array-data

    :array_1772
    .array-data 2
        0x6f78s
        0x26c0s
        -0x3e2s
        -0x4da0s
        0x49b1s
        0x1ff1s
        -0x2aa5s
        0x6c9bs
        0x22f1s
        -0x7d3s
        -0x7190s
        0x45bes
        0x1b2es
        -0x2eb1s
        0x6893s
        0x3eefs
    .end array-data

    :array_1786
    .array-data 2
        0x31c1s
        -0x62afs
        0x4b69s
        0xc87s
    .end array-data

    :array_178e
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data

    :array_1796
    .array-data 2
        0x3ad1s
        -0x3efds
        -0x27f6s
        0x1e0es
        -0x4a80s
        0x7073s
        0x1304s
        -0x15cs
        -0x12b4s
        -0x7fccs
        -0xc18s
        -0x6bdfs
        0xac4s
        -0x6b76s
        0x612es
        -0x686s
        -0x6847s
        -0x6d5cs
        0x2247s
        0x452fs
        -0x797ds
        -0x7f73s
    .end array-data

    :array_17b0
    .array-data 2
        0x6f74s
        0x7542s
        0x5b0es
        0x21dcs
        0x79es
        -0x13b1s
        -0xdf1s
        -0x2706s
        -0x4174s
        -0x7cb9s
        0x690bs
        0x4fd0s
        0x558cs
        0x3a4fs
        0x6s
    .end array-data
.end method

.method public onCreate()V
    .registers 4

    const/4 v0, 0x2

    .line 782
    rem-int v1, v0, v0

    sget v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 v1, v1, 0x29

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr v1, v0

    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    if-eqz v1, :cond_1b

    sget p0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    add-int/lit8 p0, p0, 0x55

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    rem-int/2addr p0, v0

    return-void

    :cond_1b
    const/4 p0, 0x0

    throw p0
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .registers 7

    const/4 v0, 0x2

    .line 66
    rem-int v1, v0, v0

    sget v1, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 v1, v1, 0x1d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr v1, v0

    if-nez v1, :cond_19

    .line 48
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const/16 v2, 0x40

    div-int/lit8 v2, v2, 0x0

    if-nez v1, :cond_20

    goto :goto_1f

    :cond_19
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_20

    :goto_1f
    return-void

    .line 53
    :cond_20
    invoke-static {}, Lo/PlayerTimelineChangeReason;->read()Lo/setCurrentAd;

    move-result-object v2

    .line 54
    invoke-static {v1}, Lo/getAdGroupCount;->IconCompatParcelizer(Landroid/os/Bundle;)Z

    move-result v3

    if-eqz v3, :cond_43

    .line 48
    sget v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 v3, v3, 0x1

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_3c

    const/16 v3, 0x12

    div-int/lit8 v3, v3, 0x0

    if-eqz v2, :cond_43

    goto :goto_3e

    :cond_3c
    if-eqz v2, :cond_43

    .line 55
    :goto_3e
    check-cast v2, Lo/setAdPositionMs;

    iput-object v2, p0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->mActionButtonClickHandler:Lo/setAdPositionMs;

    goto :goto_59

    .line 58
    :cond_43
    invoke-static {}, Lo/getAdGroupCount;->IconCompatParcelizer()Lo/setCurrentAd;

    move-result-object v2

    check-cast v2, Lo/setAdPositionMs;

    iput-object v2, p0, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->mActionButtonClickHandler:Lo/setAdPositionMs;

    .line 48
    sget v2, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->IconCompatParcelizer:I

    add-int/lit8 v2, v2, 0x29

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->MediaBrowserCompatItemReceiver:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_59

    const/4 v0, 0x5

    div-int/lit8 v0, v0, 0x3

    .line 61
    :cond_59
    :goto_59
    const-string v0, "ct_type"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    const-string v2, "com.clevertap.ACTION_BUTTON_CLICK"

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6e

    .line 63
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    .line 64
    invoke-direct {p0, v1}, Lcom/clevertap/android/sdk/pushnotification/CTNotificationIntentService;->handleActionButtonClick(Landroid/os/Bundle;)V

    return-void

    .line 66
    :cond_6e
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-void
.end method
