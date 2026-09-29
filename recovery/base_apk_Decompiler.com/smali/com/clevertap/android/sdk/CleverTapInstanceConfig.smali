###### Class com.clevertap.android.sdk.CleverTapInstanceConfig (com.clevertap.android.sdk.CleverTapInstanceConfig)
.class public Lcom/clevertap/android/sdk/CleverTapInstanceConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:Z

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Z

.field private MediaBrowserCompatItemReceiver:Z

.field private MediaBrowserCompatMediaItem:[Ljava/lang/String;

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private MediaDescriptionCompat:Ljava/lang/String;

.field private MediaMetadataCompat:Ljava/lang/String;

.field private RatingCompat:I

.field private RemoteActionCompatParcelizer:Ljava/lang/String;

.field private handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/String;

.field private onAddQueueItem:Z

.field private onCommand:Lo/RendererWakeupListener;

.field private onCustomAction:Ljava/lang/String;

.field private onFastForward:Ljava/lang/String;

.field private onMediaButtonEvent:Z

.field private onPause:Z

.field private final onPlayFromMediaId:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo/getAdsId;",
            ">;"
        }
    .end annotation
.end field

.field private read:Ljava/lang/String;

.field private write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 32
    new-instance v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig$1;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig$1;-><init>()V

    sput-object v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 6

    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-static {}, Lo/getAdState;->read()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId:Ljava/util/ArrayList;

    .line 64
    sget-object v0, Lo/getTimelines;->write:[Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 326
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write:Ljava/lang/String;

    .line 327
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read:Ljava/lang/String;

    .line 328
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 329
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCustomAction:Ljava/lang/String;

    .line 330
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onFastForward:Ljava/lang/String;

    .line 331
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 332
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3b

    move v0, v1

    goto :goto_3c

    :cond_3b
    move v0, v2

    :goto_3c
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->IconCompatParcelizer:Z

    .line 333
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_46

    move v0, v1

    goto :goto_47

    :cond_46
    move v0, v2

    :goto_47
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onAddQueueItem:Z

    .line 334
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_51

    move v0, v1

    goto :goto_52

    :cond_51
    move v0, v2

    :goto_52
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onMediaButtonEvent:Z

    .line 335
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_5c

    move v0, v1

    goto :goto_5d

    :cond_5c
    move v0, v2

    :goto_5d
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatItemReceiver:Z

    .line 336
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_67

    move v0, v1

    goto :goto_68

    :cond_67
    move v0, v2

    :goto_68
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 337
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    .line 338
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_78

    move v0, v1

    goto :goto_79

    :cond_78
    move v0, v2

    :goto_79
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 339
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_83

    move v0, v1

    goto :goto_84

    :cond_83
    move v0, v2

    :goto_84
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPause:Z

    .line 340
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_8e

    move v0, v1

    goto :goto_8f

    :cond_8e
    move v0, v2

    :goto_8f
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer:Z

    .line 341
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_99

    move v0, v1

    goto :goto_9a

    :cond_99
    move v0, v2

    :goto_9a
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatSearchResultReceiver:Z

    .line 342
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat:Ljava/lang/String;

    .line 343
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/String;

    .line 344
    new-instance v0, Lo/RendererWakeupListener;

    iget v3, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    invoke-direct {v0, v3}, Lo/RendererWakeupListener;-><init>(I)V

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    .line 345
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_b8

    goto :goto_b9

    :cond_b8
    move v1, v2

    :goto_b9
    iput-boolean v1, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplBaseParcelizer:Z

    .line 346
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 347
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat:I

    .line 348
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat:Ljava/lang/String;

    .line 350
    :try_start_cd
    new-instance v0, Lorg/json/JSONArray;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 351
    :goto_d6
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-ge v2, p1, :cond_ec

    .line 352
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Lo/getAdsId;->read(Lorg/json/JSONObject;)Lo/getAdsId;

    move-result-object p1

    if-eqz p1, :cond_e9

    .line 354
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write(Lo/getAdsId;)V
    :try_end_e9
    .catch Lorg/json/JSONException; {:try_start_cd .. :try_end_e9} :catch_ed

    :cond_e9
    add-int/lit8 v2, v2, 0x1

    goto :goto_d6

    :cond_ec
    return-void

    .line 358
    :catch_ed
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 29
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V
    .registers 4

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-static {}, Lo/getAdState;->read()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId:Ljava/util/ArrayList;

    .line 64
    sget-object v0, Lo/getTimelines;->write:[Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 147
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write:Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write:Ljava/lang/String;

    .line 148
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read:Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read:Ljava/lang/String;

    .line 149
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 150
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCustomAction:Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCustomAction:Ljava/lang/String;

    .line 151
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onFastForward:Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onFastForward:Ljava/lang/String;

    .line 152
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 153
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onAddQueueItem:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onAddQueueItem:Z

    .line 154
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->IconCompatParcelizer:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->IconCompatParcelizer:Z

    .line 155
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 156
    iget v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    iput v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    .line 157
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    .line 158
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onMediaButtonEvent:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onMediaButtonEvent:Z

    .line 159
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatItemReceiver:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatItemReceiver:Z

    .line 160
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatCustomActionResultReceiver:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 161
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPause:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPause:Z

    .line 162
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer:Z

    .line 163
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatSearchResultReceiver:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatSearchResultReceiver:Z

    .line 164
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat:Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat:Ljava/lang/String;

    .line 165
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/String;

    .line 166
    iget-boolean v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplBaseParcelizer:Z

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplBaseParcelizer:Z

    .line 167
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 168
    iget v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat:I

    iput v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat:I

    .line 169
    iget-object v0, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/getAdsId;

    .line 170
    invoke-direct {p0, v1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write(Lo/getAdsId;)V

    goto :goto_6b

    .line 172
    :cond_7b
    iget-object p1, p1, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat:Ljava/lang/String;

    iput-object p1, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .registers 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 240
    const-string v1, "allowedPushTypes"

    const-string v2, "encryptionLevel"

    const-string v3, "identityTypes"

    const-string v4, "beta"

    const-string v5, "fcmSenderId"

    const-string v6, "getEnableCustomCleverTapId"

    const-string v7, "backgroundSync"

    const-string v8, "sslPinning"

    const-string v9, "createdPostAppLaunch"

    const-string v10, "packageName"

    const-string v11, "debugLevel"

    const-string v12, "personalization"

    const-string v13, "disableAppLaunchedEvent"

    const-string v14, "useGoogleAdId"

    const-string v15, "isDefaultInstance"

    move-object/from16 v16, v1

    const-string v1, "analyticsOnly"

    move-object/from16 v17, v2

    const-string v2, "accountRegion"

    move-object/from16 v18, v3

    const-string v3, "customHandshakeDomain"

    move-object/from16 v19, v4

    const-string v4, "spikyProxyDomain"

    move-object/from16 v20, v5

    const-string v5, "proxyDomain"

    move-object/from16 v21, v6

    const-string v6, "accountToken"

    move-object/from16 v22, v7

    const-string v7, "accountId"

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v23, v8

    .line 51
    invoke-static {}, Lo/getAdState;->read()Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId:Ljava/util/ArrayList;

    .line 64
    sget-object v8, Lo/getTimelines;->write:[Ljava/lang/String;

    iput-object v8, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 242
    :try_start_4b
    new-instance v8, Lorg/json/JSONObject;

    move-object/from16 v24, v9

    move-object/from16 v9, p1

    invoke-direct {v8, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 243
    invoke-virtual {v8, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_60

    .line 244
    invoke-virtual {v8, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write:Ljava/lang/String;

    .line 246
    :cond_60
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6c

    .line 247
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read:Ljava/lang/String;

    .line 249
    :cond_6c
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_78

    .line 250
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCustomAction:Ljava/lang/String;

    .line 252
    :cond_78
    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_84

    .line 253
    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onFastForward:Ljava/lang/String;

    .line 255
    :cond_84
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_91

    const/4 v4, 0x0

    .line 256
    invoke-virtual {v8, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 258
    :cond_91
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9d

    .line 259
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 261
    :cond_9d
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a9

    .line 262
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->IconCompatParcelizer:Z

    .line 264
    :cond_a9
    invoke-virtual {v8, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b5

    .line 265
    invoke-virtual {v8, v15}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onAddQueueItem:Z

    .line 267
    :cond_b5
    invoke-virtual {v8, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c1

    .line 268
    invoke-virtual {v8, v14}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onMediaButtonEvent:Z

    .line 270
    :cond_c1
    invoke-virtual {v8, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_cd

    .line 271
    invoke-virtual {v8, v13}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatItemReceiver:Z

    .line 273
    :cond_cd
    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d9

    .line 274
    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 276
    :cond_d9
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e5

    .line 277
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    .line 279
    :cond_e5
    new-instance v1, Lo/RendererWakeupListener;

    iget v2, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    invoke-direct {v1, v2}, Lo/RendererWakeupListener;-><init>(I)V

    iput-object v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    .line 281
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_fa

    .line 282
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/String;

    :cond_fa
    move-object/from16 v1, v24

    .line 284
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_108

    .line 285
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatCustomActionResultReceiver:Z

    :cond_108
    move-object/from16 v1, v23

    .line 287
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_116

    .line 288
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPause:Z

    :cond_116
    move-object/from16 v1, v22

    .line 290
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_124

    .line 291
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer:Z

    :cond_124
    move-object/from16 v1, v21

    .line 293
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_132

    .line 294
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatSearchResultReceiver:Z

    :cond_132
    move-object/from16 v1, v20

    .line 296
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_140

    .line 297
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat:Ljava/lang/String;

    :cond_140
    move-object/from16 v1, v19

    .line 299
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14e

    .line 300
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplBaseParcelizer:Z

    :cond_14e
    move-object/from16 v1, v18

    .line 302
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_162

    .line 303
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Lo/AnalyticsCollector;->read(Lorg/json/JSONArray;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    :cond_162
    move-object/from16 v1, v17

    .line 305
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_170

    .line 306
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat:I

    :cond_170
    move-object/from16 v1, v16

    .line 308
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_193

    .line 309
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    .line 310
    :goto_17d
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_193

    .line 311
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 312
    invoke-static {v3}, Lo/getAdsId;->read(Lorg/json/JSONObject;)Lo/getAdsId;

    move-result-object v3

    if-eqz v3, :cond_190

    .line 314
    invoke-direct {v0, v3}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write(Lo/getAdsId;)V

    :cond_190
    add-int/lit8 v2, v2, 0x1

    goto :goto_17d

    .line 318
    :cond_193
    const-string v1, "encryptionInTransit"

    const-string v2, "0"

    invoke-virtual {v8, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat:Ljava/lang/String;
    :try_end_19d
    .catchall {:try_start_4b .. :try_end_19d} :catchall_19e

    return-void

    :catchall_19e
    move-exception v0

    .line 320
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    invoke-static {}, Lo/RendererWakeupListener;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    .line 321
    throw v0
.end method

.method private constructor <init>(Lo/RendererState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 6

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-static {}, Lo/getAdState;->read()Ljava/util/ArrayList;

    move-result-object p5

    iput-object p5, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId:Ljava/util/ArrayList;

    .line 64
    sget-object p5, Lo/getTimelines;->write:[Ljava/lang/String;

    iput-object p5, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 182
    iput-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write:Ljava/lang/String;

    .line 183
    iput-object p3, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read:Ljava/lang/String;

    .line 184
    iput-object p4, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    const/4 p2, 0x1

    .line 185
    iput-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onAddQueueItem:Z

    const/4 p3, 0x0

    .line 186
    iput-boolean p3, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->IconCompatParcelizer:Z

    .line 187
    iput-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 188
    sget-object p2, Lo/PlayerTimelineChangeReason$AudioAttributesCompatParcelizer;->write:Lo/PlayerTimelineChangeReason$AudioAttributesCompatParcelizer;

    invoke-virtual {p2}, Lo/PlayerTimelineChangeReason$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()I

    move-result p2

    iput p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    .line 189
    new-instance p4, Lo/RendererWakeupListener;

    invoke-direct {p4, p2}, Lo/RendererWakeupListener;-><init>(I)V

    iput-object p4, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    .line 190
    iput-boolean p3, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 192
    invoke-virtual {p1}, Lo/RendererState;->onPlayFromMediaId()Z

    move-result p2

    iput-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onMediaButtonEvent:Z

    .line 193
    invoke-virtual {p1}, Lo/RendererState;->onAddQueueItem()Z

    move-result p2

    iput-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatItemReceiver:Z

    .line 194
    invoke-virtual {p1}, Lo/RendererState;->onFastForward()Z

    move-result p2

    iput-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPause:Z

    .line 195
    invoke-virtual {p1}, Lo/RendererState;->onCommand()Z

    move-result p2

    iput-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer:Z

    .line 196
    invoke-virtual {p1}, Lo/RendererState;->MediaBrowserCompatCustomActionResultReceiver()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat:Ljava/lang/String;

    .line 197
    invoke-virtual {p1}, Lo/RendererState;->RatingCompat()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/String;

    .line 198
    invoke-virtual {p1}, Lo/RendererState;->onPlay()Z

    move-result p2

    iput-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatSearchResultReceiver:Z

    .line 199
    invoke-virtual {p1}, Lo/RendererState;->read()Z

    move-result p2

    iput-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplBaseParcelizer:Z

    .line 203
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onAddQueueItem:Z

    if-eqz p2, :cond_86

    .line 204
    invoke-virtual {p1}, Lo/RendererState;->AudioAttributesImplBaseParcelizer()I

    move-result p2

    iput p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat:I

    .line 205
    invoke-virtual {p1}, Lo/RendererState;->MediaMetadataCompat()[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 206
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Setting Profile Keys from Manifest: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 207
    invoke-static {p3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 206
    const-string p3, "ON_USER_LOGIN"

    invoke-virtual {p0, p3, p2}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_88

    .line 209
    :cond_86
    iput p3, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat:I

    .line 211
    :goto_88
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer(Lo/RendererState;)V

    .line 213
    invoke-virtual {p1}, Lo/RendererState;->AudioAttributesImplApi26Parcelizer()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_93

    .line 214
    const-string p1, "0"

    :cond_93
    iput-object p1, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat:Ljava/lang/String;

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Lo/RendererState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/clevertap/android/sdk/CleverTapInstanceConfig;
    .registers 11

    .line 132
    new-instance v6, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;

    const/4 v5, 0x1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;-><init>(Lo/RendererState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v6
.end method

.method private AudioAttributesCompatParcelizer(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    .line 667
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, ":"

    if-nez v1, :cond_18

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1a

    :cond_18
    const-string p1, ""

    :goto_1a
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer(Lo/RendererState;)V
    .registers 13

    .line 219
    :try_start_0
    invoke-virtual {p1}, Lo/RendererState;->onCustomAction()Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_4} :catch_66

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x4

    .line 220
    const-string v6, ","

    if-eqz v0, :cond_36

    .line 221
    :try_start_d
    invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_36

    .line 222
    array-length v7, v0

    if-ne v7, v5, :cond_36

    .line 223
    new-instance v7, Lo/getAdsId;

    aget-object v8, v0, v4

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    aget-object v9, v0, v3

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    aget-object v10, v0, v2

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v8, v9, v10, v0}, Lo/getAdsId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    invoke-direct {p0, v7}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write(Lo/getAdsId;)V

    .line 227
    :cond_36
    invoke-virtual {p1}, Lo/RendererState;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_65

    .line 229
    invoke-virtual {p1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_65

    .line 230
    array-length v0, p1

    if-ne v0, v5, :cond_65

    .line 231
    new-instance v0, Lo/getAdsId;

    aget-object v4, p1, v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    aget-object v3, p1, v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    aget-object v2, p1, v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v4, v3, v2, p1}, Lo/getAdsId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    invoke-direct {p0, v0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write(Lo/getAdsId;)V
    :try_end_65
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_65} :catch_66

    :cond_65
    return-void

    .line 236
    :catch_66
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-void
.end method

.method public static IconCompatParcelizer(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/clevertap/android/sdk/CleverTapInstanceConfig;
    .registers 4

    .line 121
    invoke-static {p0}, Lo/RendererState;->IconCompatParcelizer(Landroid/content/Context;)Lo/RendererState;

    move-result-object p0

    .line 122
    invoke-static {p0, p1, p2, p3}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer(Lo/RendererState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/clevertap/android/sdk/CleverTapInstanceConfig;

    move-result-object p0

    return-object p0
.end method

.method public static IconCompatParcelizer(Ljava/lang/String;)Lcom/clevertap/android/sdk/CleverTapInstanceConfig;
    .registers 2

    .line 140
    :try_start_0
    new-instance v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;

    invoke-direct {v0, p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_0 .. :try_end_5} :catchall_6

    return-object v0

    :catchall_6
    const/4 p0, 0x0

    return-object p0
.end method

.method private onFastForward()Ljava/lang/String;
    .registers 1

    .line 442
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat:Ljava/lang/String;

    return-object p0
.end method

.method private onMediaButtonEvent()I
    .registers 1

    .line 400
    iget p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    return p0
.end method

.method private onPlayFromMediaId()Lorg/json/JSONArray;
    .registers 4

    .line 656
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 657
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_d
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/getAdsId;

    .line 659
    sget-object v2, Lo/getAdGroupIndexAfterPositionUs;->IconCompatParcelizer:Lo/getAdsId;

    if-eq v1, v2, :cond_d

    .line 660
    invoke-virtual {v1}, Lo/getAdsId;->write()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_d

    :cond_25
    return-object v0
.end method

.method private onPlayFromUri()Z
    .registers 1

    .line 471
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplBaseParcelizer:Z

    return p0
.end method

.method private onPrepareFromMediaId()Ljava/lang/String;
    .registers 1

    .line 453
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/String;

    return-object p0
.end method

.method private write(Lo/getAdsId;)V
    .registers 3

    .line 393
    iget-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 394
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_d
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 379
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Ljava/lang/String;
    .registers 1

    .line 404
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCustomAction:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Ljava/util/ArrayList;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lo/getAdsId;",
            ">;"
        }
    .end annotation

    .line 389
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()I
    .registers 1

    .line 580
    iget p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat:I

    return p0
.end method

.method public final IconCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 384
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 4

    .line 485
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p2}, Lo/RendererWakeupListener;->IconCompatParcelizer()V

    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()[Ljava/lang/String;
    .registers 1

    .line 457
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()Lo/RendererWakeupListener;
    .registers 3

    .line 446
    iget-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    if-nez v0, :cond_d

    .line 447
    new-instance v0, Lo/RendererWakeupListener;

    iget v1, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    invoke-direct {v0, v1}, Lo/RendererWakeupListener;-><init>(I)V

    iput-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    .line 449
    :cond_d
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    return-object p0
.end method

.method public final MediaBrowserCompatMediaItem()Ljava/lang/String;
    .registers 1

    .line 412
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onFastForward:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()Z
    .registers 1

    .line 475
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onAddQueueItem:Z

    return p0
.end method

.method public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z
    .registers 1

    .line 566
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPause:Z

    return p0
.end method

.method public final MediaDescriptionCompat()Z
    .registers 1

    .line 549
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatCustomActionResultReceiver:Z

    return p0
.end method

.method public final MediaMetadataCompat()Z
    .registers 1

    .line 462
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->IconCompatParcelizer:Z

    return p0
.end method

.method public final RatingCompat()Z
    .registers 1

    .line 540
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer:Z

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 420
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Ljava/lang/String;)V
    .registers 2

    .line 408
    iput-object p1, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCustomAction:Ljava/lang/String;

    return-void
.end method

.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final handleMediaPlayPauseIfPendingOnHandler()Z
    .registers 1

    .line 562
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    return p0
.end method

.method public final onAddQueueItem()Z
    .registers 2

    const/4 v0, 0x0

    .line 589
    :try_start_1
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat:Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_7} :catch_c

    if-lez p0, :cond_b

    const/4 p0, 0x1

    return p0

    :cond_b
    return v0

    .line 591
    :catch_c
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return v0
.end method

.method public final onCommand()Z
    .registers 1

    .line 570
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onMediaButtonEvent:Z

    return p0
.end method

.method public final onCustomAction()Z
    .registers 1

    .line 553
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatItemReceiver:Z

    return p0
.end method

.method public final onPause()Ljava/lang/String;
    .registers 4

    .line 621
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 623
    :try_start_5
    const-string v1, "accountId"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 624
    const-string v1, "accountToken"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 625
    const-string v1, "accountRegion"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 626
    const-string v1, "proxyDomain"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi21Parcelizer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 627
    const-string v1, "spikyProxyDomain"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 628
    const-string v1, "customHandshakeDomain"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 629
    const-string v1, "fcmSenderId"

    invoke-direct {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onFastForward()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 630
    const-string v1, "analyticsOnly"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 631
    const-string v1, "isDefaultInstance"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatSearchResultReceiver()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 632
    const-string v1, "useGoogleAdId"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 633
    const-string v1, "disableAppLaunchedEvent"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCustomAction()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 634
    const-string v1, "personalization"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 635
    const-string v1, "debugLevel"

    invoke-direct {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onMediaButtonEvent()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 636
    const-string v1, "createdPostAppLaunch"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 637
    const-string v1, "sslPinning"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 638
    const-string v1, "backgroundSync"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 639
    const-string v1, "getEnableCustomCleverTapId"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 640
    const-string v1, "packageName"

    invoke-direct {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPrepareFromMediaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 641
    const-string v1, "beta"

    invoke-direct {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromUri()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 642
    const-string v1, "encryptionLevel"

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplBaseParcelizer()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 643
    const-string v1, "encryptionInTransit"

    iget-object v2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 644
    invoke-direct {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId()Lorg/json/JSONArray;

    move-result-object p0

    .line 645
    const-string v1, "allowedPushTypes"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 647
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_cd
    .catchall {:try_start_5 .. :try_end_cd} :catchall_ce

    return-object p0

    :catchall_ce
    move-exception p0

    .line 649
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    invoke-static {}, Lo/RendererWakeupListener;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final onPlay()V
    .registers 2

    const/4 v0, 0x1

    .line 574
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatCustomActionResultReceiver:Z

    return-void
.end method

.method public final read(Ljava/lang/String;)V
    .registers 2

    .line 424
    iput-object p1, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    return-void
.end method

.method public final read(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 480
    iget-object v0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCommand:Lo/RendererWakeupListener;

    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p2}, Lo/RendererWakeupListener;->write(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final read()Z
    .registers 1

    .line 530
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatSearchResultReceiver:Z

    return p0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 374
    iget-object p0, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write:Ljava/lang/String;

    return-object p0
.end method

.method public final write(Ljava/lang/String;)V
    .registers 2

    .line 416
    iput-object p1, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onFastForward:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 503
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 504
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 505
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 506
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onCustomAction:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 507
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onFastForward:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 508
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 509
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->IconCompatParcelizer:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 510
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onAddQueueItem:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 511
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onMediaButtonEvent:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 512
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatItemReceiver:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 513
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 514
    iget p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 515
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatCustomActionResultReceiver:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 516
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPause:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 517
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesCompatParcelizer:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 518
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatSearchResultReceiver:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 519
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 520
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 521
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->AudioAttributesImplBaseParcelizer:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 522
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 523
    iget p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->RatingCompat:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 524
    iget-object p2, p0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaDescriptionCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 525
    invoke-direct {p0}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->onPlayFromMediaId()Lorg/json/JSONArray;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p0

    .line 526
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.clevertap.android.sdk.CleverTapInstanceConfig.AnonymousClass1 (com.clevertap.android.sdk.CleverTapInstanceConfig$1)
.class final Lcom/clevertap/android/sdk/CleverTapInstanceConfig$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/CleverTapInstanceConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/CleverTapInstanceConfig;
    .registers 3

    .line 36
    new-instance v0, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method

.method private static write(I)[Lcom/clevertap/android/sdk/CleverTapInstanceConfig;
    .registers 1

    .line 41
    new-array p0, p0, [Lcom/clevertap/android/sdk/CleverTapInstanceConfig;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 33
    invoke-static {p1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig$1;->IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/CleverTapInstanceConfig;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 33
    invoke-static {p1}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig$1;->write(I)[Lcom/clevertap/android/sdk/CleverTapInstanceConfig;

    move-result-object p0

    return-object p0
.end method
