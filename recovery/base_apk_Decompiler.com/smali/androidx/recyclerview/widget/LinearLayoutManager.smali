###### Class androidx.recyclerview.widget.LinearLayoutManager (androidx.recyclerview.widget.LinearLayoutManager)
.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$onCustomAction$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;,
        Landroidx/recyclerview/widget/LinearLayoutManager$read;,
        Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;,
        Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

.field private IconCompatParcelizer:I

.field MediaBrowserCompatCustomActionResultReceiver:Z

.field MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private final RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager$read;

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:Z

.field private onCommand:[I

.field private onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

.field private onFastForward:Z

.field private onMediaButtonEvent:Z

.field private onPlay:Z

.field final read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

.field write:I


# direct methods
.method public constructor <init>()V
    .registers 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 163
    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .registers 5

    .line 178
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;-><init>()V

    const/4 v0, 0x1

    .line 67
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v1, 0x0

    .line 94
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onFastForward:Z

    .line 101
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 108
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    .line 114
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    const/4 v0, -0x1

    .line 120
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    const/high16 v0, -0x80000000

    .line 126
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    const/4 v0, 0x0

    .line 130
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 136
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    .line 141
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$read;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$read;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager$read;

    const/4 v0, 0x2

    .line 146
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer:I

    .line 151
    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCommand:[I

    .line 179
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer(I)V

    .line 180
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 7

    .line 193
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;-><init>()V

    const/4 v0, 0x1

    .line 67
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v1, 0x0

    .line 94
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onFastForward:Z

    .line 101
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 108
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    .line 114
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    const/4 v0, -0x1

    .line 120
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    const/high16 v0, -0x80000000

    .line 126
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    const/4 v0, 0x0

    .line 130
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 136
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    .line 141
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$read;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$read;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager$read;

    const/4 v0, 0x2

    .line 146
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer:I

    .line 151
    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCommand:[I

    .line 194
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;

    move-result-object p1

    .line 195
    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->write:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer(I)V

    .line 196
    iget-boolean p2, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->RemoteActionCompatParcelizer:Z

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Z)V

    .line 197
    iget-boolean p1, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->IconCompatParcelizer:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Z)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 9

    .line 1416
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3a

    if-eqz p1, :cond_3a

    .line 1419
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 1420
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->RatingCompat:Z

    if-lez p1, :cond_15

    move v0, v2

    goto :goto_16

    :cond_15
    const/4 v0, -0x1

    .line 1422
    :goto_16
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 1423
    invoke-direct {p0, v0, v3, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(IIZLandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 1424
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v2, v2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    .line 1425
    invoke-direct {p0, p2, v4, p3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    move-result p2

    add-int/2addr v2, p2

    if-gez v2, :cond_2b

    return v1

    :cond_2b
    if-le v3, v2, :cond_2f

    mul-int p1, v0, v2

    .line 1433
    :cond_2f
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    neg-int p3, p1

    invoke-virtual {p2, p3}, Lo/UIntDeserializer;->read(I)V

    .line 1437
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    return p1

    :cond_3a
    return v1
.end method

.method private AudioAttributesCompatParcelizer()Landroid/view/View;
    .registers 3

    const/4 v0, 0x0

    .line 1955
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v1

    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer(II)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer(Z)Landroid/view/View;
    .registers 5

    .line 1818
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_10

    .line 1819
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v2, -0x1

    invoke-direct {p0, v0, v2, p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_10
    const/4 v0, 0x0

    .line 1822
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v2

    invoke-direct {p0, v0, v2, p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)V
    .registers 3

    .line 1049
    iget v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    iget p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-direct {p0, v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer(II)V

    return-void
.end method

.method private AudioAttributesImplApi21Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 8

    .line 1209
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    .line 1212
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 1213
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1214
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1215
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    move-object v0, p1

    move-object v4, p0

    .line 1213
    invoke-static/range {v0 .. v5}, Lo/serializedjbwkw;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/UIntDeserializer;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;Z)I

    move-result p0

    return p0
.end method

.method private AudioAttributesImplApi21Parcelizer(II)Landroid/view/View;
    .registers 6

    .line 2070
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    if-gt p2, p1, :cond_d

    if-ge p2, p1, :cond_8

    goto :goto_d

    .line 2073
    :cond_8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 2077
    :cond_d
    :goto_d
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 2078
    invoke-virtual {v1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    if-ge v0, v1, :cond_24

    const/16 v0, 0x4104

    const/16 v1, 0x4004

    goto :goto_28

    :cond_24
    const/16 v0, 0x1041

    const/16 v1, 0x1001

    .line 2089
    :goto_28
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-nez v2, :cond_33

    .line 2090
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer:Lo/ULongDeserializer;

    invoke-virtual {p0, p1, p2, v0, v1}, Lo/ULongDeserializer;->RemoteActionCompatParcelizer(IIII)Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 2092
    :cond_33
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RatingCompat:Lo/ULongDeserializer;

    invoke-virtual {p0, p1, p2, v0, v1}, Lo/ULongDeserializer;->RemoteActionCompatParcelizer(IIII)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 9

    .line 1198
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    .line 1201
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 1202
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1203
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1204
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    move-object v0, p1

    move-object v4, p0

    .line 1202
    invoke-static/range {v0 .. v6}, Lo/serializedjbwkw;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/UIntDeserializer;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;ZZ)I

    move-result p0

    return p0
.end method

.method private AudioAttributesImplApi26Parcelizer(II)V
    .registers 6

    .line 1039
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v1

    sub-int/2addr v1, p2

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 1040
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_14

    const/4 v1, -0x1

    goto :goto_15

    :cond_14
    move v1, v2

    .line 1041
    :goto_15
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    .line 1042
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 1043
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v2, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 1044
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p2, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1045
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    return-void
.end method

.method private AudioAttributesImplBaseParcelizer(II)V
    .registers 5

    .line 1053
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    sub-int v1, p2, v1

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 1054
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 1055
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_19

    const/4 v0, 0x1

    goto :goto_1a

    :cond_19
    move v0, v1

    .line 1056
    :goto_1a
    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    .line 1057
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v1, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 1058
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p2, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1059
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    return-void
.end method

.method private IconCompatParcelizer()Landroid/view/View;
    .registers 3

    .line 1959
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer(II)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private IconCompatParcelizer(IIZLandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 9

    .line 1263
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ParcelableVolumeInfo()Z

    move-result v1

    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->read:Z

    .line 1264
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 1265
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCommand:[I

    const/4 v1, 0x0

    aput v1, v0, v1

    const/4 v2, 0x1

    .line 1266
    aput v1, v0, v2

    .line 1267
    invoke-virtual {p0, p4, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;[I)V

    .line 1268
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCommand:[I

    aget p4, p4, v1

    invoke-static {v1, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    .line 1269
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCommand:[I

    aget v0, v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-ne p1, v2, :cond_2a

    move v1, v2

    .line 1271
    :cond_2a
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    if-eqz v1, :cond_30

    move v3, v0

    goto :goto_31

    :cond_30
    move v3, p4

    :goto_31
    iput v3, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 1272
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    if-nez v1, :cond_38

    move p4, v0

    :cond_38
    iput p4, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    const/4 p1, -0x1

    if-eqz v1, :cond_7c

    .line 1275
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v0, p4, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p4, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 1277
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onSkipToQueueItem()Landroid/view/View;

    move-result-object p4

    .line 1279
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v1, :cond_55

    move v2, p1

    .line 1280
    :cond_55
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    .line 1281
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-static {p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v1, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v0, v1

    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 1282
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v0, p4}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v0

    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1284
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p1, p4}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result p1

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 1285
    invoke-virtual {p4}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p4

    sub-int/2addr p1, p4

    goto :goto_bc

    .line 1288
    :cond_7c
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onSkipToPrevious()Landroid/view/View;

    move-result-object p4

    .line 1289
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v3

    add-int/2addr v1, v3

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 1290
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v1, :cond_94

    goto :goto_95

    :cond_94
    move v2, p1

    .line 1291
    :goto_95
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    .line 1292
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-static {p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v1, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v0, v1

    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 1293
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v0, p4}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v0

    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1294
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p1, p4}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p1

    neg-int p1, p1

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 1295
    invoke-virtual {p4}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p4

    add-int/2addr p1, p4

    .line 1297
    :goto_bc
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-eqz p3, :cond_c9

    .line 1299
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget p3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    sub-int/2addr p3, p1

    iput p3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 1301
    :cond_c9
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    return-void
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)V
    .registers 3

    .line 1035
    iget v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    iget p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-direct {p0, v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi26Parcelizer(II)V

    return-void
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)V
    .registers 5

    .line 830
    invoke-direct {p0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)Z

    move-result v0

    if-nez v0, :cond_1e

    .line 837
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_1e

    .line 846
    :cond_d
    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write()V

    .line 847
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    if-eqz p0, :cond_1b

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    goto :goto_1c

    :cond_1b
    const/4 p0, 0x0

    :goto_1c
    iput p0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    :cond_1e
    :goto_1e
    return-void
.end method

.method private IconCompatParcelizer(Z)V
    .registers 3

    const/4 v0, 0x0

    .line 412
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 413
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onFastForward:Z

    if-ne p1, v0, :cond_9

    return-void

    .line 416
    :cond_9
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onFastForward:Z

    .line 417
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)Z
    .registers 7

    .line 903
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_fc

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_fc

    const/high16 v3, -0x80000000

    if-ltz v0, :cond_f8

    .line 907
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p1

    if-ge v0, p1, :cond_f8

    .line 918
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    iput p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    .line 919
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    const/4 v0, 0x1

    if-eqz p1, :cond_4b

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write()Z

    move-result p1

    if-eqz p1, :cond_4b

    .line 922
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget-boolean p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write:Z

    iput-boolean p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    .line 923
    iget-boolean p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-eqz p1, :cond_3d

    .line 924
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p1

    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer:I

    sub-int/2addr p1, p0

    iput p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    goto :goto_4a

    .line 927
    :cond_3d
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p1

    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer:I

    add-int/2addr p1, p0

    iput p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    :goto_4a
    return v0

    .line 933
    :cond_4b
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    if-ne p1, v3, :cond_d8

    .line 934
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_b8

    .line 936
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v2, p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v2

    .line 937
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v3}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v3

    if-le v2, v3, :cond_69

    .line 939
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write()V

    return v0

    .line 942
    :cond_69
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v2, p1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 943
    invoke-virtual {v3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v3

    sub-int/2addr v2, v3

    if-gez v2, :cond_83

    .line 945
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p0

    iput p0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 946
    iput-boolean v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    return v0

    .line 949
    :cond_83
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 950
    invoke-virtual {v2, p1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v2

    sub-int/2addr v1, v2

    if-gez v1, :cond_9d

    .line 952
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p0

    iput p0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 953
    iput-boolean v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    return v0

    .line 956
    :cond_9d
    iget-boolean v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-eqz v1, :cond_af

    .line 957
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1, p1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result p1

    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 958
    invoke-virtual {p0}, Lo/UIntDeserializer;->AudioAttributesImplApi26Parcelizer()I

    move-result p0

    add-int/2addr p1, p0

    goto :goto_b5

    .line 959
    :cond_af
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0, p1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p1

    :goto_b5
    iput p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    goto :goto_d7

    .line 961
    :cond_b8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p1

    if-lez p1, :cond_d4

    .line 963
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p1

    .line 964
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ge v2, p1, :cond_cc

    move p1, v0

    goto :goto_cd

    :cond_cc
    move p1, v1

    :goto_cd
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-ne p1, p0, :cond_d2

    move v1, v0

    :cond_d2
    iput-boolean v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    .line 967
    :cond_d4
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write()V

    :goto_d7
    return v0

    .line 972
    :cond_d8
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    iput-boolean p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    .line 974
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz p1, :cond_ec

    .line 975
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p1

    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    sub-int/2addr p1, p0

    iput p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    goto :goto_f7

    .line 978
    :cond_ec
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p1

    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    add-int/2addr p1, p0

    iput p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    :goto_f7
    return v0

    .line 908
    :cond_f8
    iput v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 909
    iput v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    :cond_fc
    return v1
.end method

.method private MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 8

    .line 1220
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    .line 1223
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 1224
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1225
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1226
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    move-object v0, p1

    move-object v4, p0

    .line 1224
    invoke-static/range {v0 .. v5}, Lo/serializedjbwkw;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/UIntDeserializer;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;Z)I

    move-result p0

    return p0
.end method

.method private MediaDescriptionCompat(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 466
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer()Z

    move-result p1

    if-eqz p1, :cond_d

    .line 467
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result p0

    return p0

    :cond_d
    const/4 p0, 0x0

    return p0
.end method

.method private static MediaSessionCompatToken()Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;
    .registers 1

    .line 1079
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;-><init>()V

    return-object v0
.end method

.method private ParcelableVolumeInfo()Z
    .registers 2

    .line 1305
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->read()I

    move-result v0

    if-nez v0, :cond_12

    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 1306
    invoke-virtual {p0}, Lo/UIntDeserializer;->write()I

    move-result p0

    if-nez p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method private PlaybackStateCompat()V
    .registers 3

    .line 380
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_11

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 383
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onFastForward:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    return-void

    .line 381
    :cond_11
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onFastForward:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    return-void
.end method

.method private RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;
    .registers 6

    .line 2048
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    const/16 v0, 0x140

    if-eqz p3, :cond_a

    const/16 p3, 0x6003

    goto :goto_b

    :cond_a
    move p3, v0

    :goto_b
    if-nez p4, :cond_e

    const/4 v0, 0x0

    .line 2062
    :cond_e
    iget p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-nez p4, :cond_19

    .line 2063
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer:Lo/ULongDeserializer;

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/ULongDeserializer;->RemoteActionCompatParcelizer(IIII)Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 2065
    :cond_19
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RatingCompat:Lo/ULongDeserializer;

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/ULongDeserializer;->RemoteActionCompatParcelizer(IIII)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private RemoteActionCompatParcelizer(Z)Landroid/view/View;
    .registers 5

    .line 1836
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    .line 1837
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v2

    invoke-direct {p0, v0, v2, p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 1840
    :cond_f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v2, -0x1

    invoke-direct {p0, v0, v2, p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V
    .registers 8

    if-ltz p2, :cond_49

    sub-int/2addr p2, p3

    .line 1497
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p3

    .line 1498
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v0, :cond_2b

    add-int/lit8 p3, p3, -0x1

    move v0, p3

    :goto_e
    if-ltz v0, :cond_49

    .line 1500
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v1

    .line 1501
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v2, v1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v2

    if-gt v2, p2, :cond_27

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 1502
    invoke-virtual {v2, v1}, Lo/UIntDeserializer;->read(Landroid/view/View;)I

    move-result v1

    if-gt v1, p2, :cond_27

    add-int/lit8 v0, v0, -0x1

    goto :goto_e

    .line 1504
    :cond_27
    invoke-direct {p0, p1, p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V

    return-void

    :cond_2b
    const/4 v0, 0x0

    move v1, v0

    :goto_2d
    if-ge v1, p3, :cond_49

    .line 1510
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v2

    .line 1511
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v3, v2}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v3

    if-gt v3, p2, :cond_46

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 1512
    invoke-virtual {v3, v2}, Lo/UIntDeserializer;->read(Landroid/view/View;)I

    move-result v2

    if-gt v2, p2, :cond_46

    add-int/lit8 v1, v1, 0x1

    goto :goto_2d

    .line 1514
    :cond_46
    invoke-direct {p0, p1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V

    :cond_49
    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;)V
    .registers 6

    .line 1581
    iget-boolean v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->RatingCompat:Z

    if-eqz v0, :cond_18

    iget-boolean v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->read:Z

    if-nez v0, :cond_18

    .line 1584
    iget v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    .line 1585
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    .line 1586
    iget p2, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    const/4 v2, -0x1

    if-ne p2, v2, :cond_15

    .line 1587
    invoke-direct {p0, p1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V

    return-void

    .line 1589
    :cond_15
    invoke-direct {p0, p1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V

    :cond_18
    return-void
.end method

.method private onSkipToPrevious()Landroid/view/View;
    .registers 2

    .line 1796
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private onSkipToQueueItem()Landroid/view/View;
    .registers 2

    .line 1806
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    goto :goto_c

    :cond_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_c
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private onStop()Landroid/view/View;
    .registers 2

    .line 1950
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v0, :cond_9

    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer()Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 1951
    :cond_9
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I
    .registers 6

    .line 989
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v0

    sub-int/2addr v0, p1

    if-lez v0, :cond_23

    neg-int v0, v0

    .line 992
    invoke-direct {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p2

    neg-int p2, p2

    if-eqz p4, :cond_22

    .line 1000
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p3}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p3

    add-int/2addr p1, p2

    sub-int/2addr p3, p1

    if-lez p3, :cond_22

    .line 1002
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0, p3}, Lo/UIntDeserializer;->read(I)V

    add-int/2addr p3, p2

    return p3

    :cond_22
    return p2

    :cond_23
    const/4 p0, 0x0

    return p0
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V
    .registers 4

    if-eq p2, p3, :cond_14

    if-le p3, p2, :cond_c

    :goto_4
    add-int/lit8 p3, p3, -0x1

    if-lt p3, p2, :cond_14

    .line 1464
    invoke-virtual {p0, p3, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    goto :goto_4

    :cond_c
    :goto_c
    if-le p2, p3, :cond_14

    .line 1468
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_c

    :cond_14
    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;II)V
    .registers 15

    .line 779
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_a4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-eqz v0, :cond_a4

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    if-nez v0, :cond_a4

    .line 780
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->M_()Z

    move-result v0

    if-eqz v0, :cond_a4

    .line 785
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer()Ljava/util/List;

    move-result-object v0

    .line 786
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    .line 787
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v3

    move v4, v2

    move v5, v4

    move v6, v5

    :goto_2c
    if-ge v4, v1, :cond_5d

    .line 789
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 790
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v8

    if-nez v8, :cond_5a

    .line 793
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result v8

    if-ge v8, v3, :cond_42

    const/4 v8, 0x1

    goto :goto_43

    :cond_42
    move v8, v2

    .line 794
    :goto_43
    iget-boolean v9, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eq v8, v9, :cond_51

    .line 797
    iget-object v8, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v8, v7}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v7

    add-int/2addr v5, v7

    goto :goto_5a

    .line 799
    :cond_51
    iget-object v8, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v8, v7}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v7

    add-int/2addr v6, v7

    :cond_5a
    :goto_5a
    add-int/lit8 v4, v4, 0x1

    goto :goto_2c

    .line 807
    :cond_5d
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput-object v0, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    if-lez v5, :cond_80

    .line 809
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onSkipToPrevious()Landroid/view/View;

    move-result-object v0

    .line 810
    invoke-static {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0, v0, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer(II)V

    .line 811
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v5, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 812
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 813
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer()V

    .line 814
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0, p1, p3, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    :cond_80
    if-lez v6, :cond_9f

    .line 818
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onSkipToQueueItem()Landroid/view/View;

    move-result-object p3

    .line 819
    invoke-static {p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p3

    invoke-direct {p0, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi26Parcelizer(II)V

    .line 820
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v6, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 821
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 822
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer()V

    .line 823
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0, p1, p3, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    .line 825
    :cond_9f
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    :cond_a4
    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)Z
    .registers 8

    .line 858
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    .line 861
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromMediaId()Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1d

    .line 862
    invoke-static {v0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Z

    move-result v3

    if-eqz v3, :cond_1d

    .line 863
    invoke-static {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    invoke-virtual {p3, v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write(Landroid/view/View;I)V

    return v2

    .line 866
    :cond_1d
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer:Z

    iget-boolean v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    if-eq v0, v3, :cond_24

    return v1

    .line 869
    :cond_24
    iget-boolean v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    iget-boolean v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    .line 870
    invoke-virtual {p0, p1, p2, v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;ZZ)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_71

    .line 876
    invoke-static {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    .line 879
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p2

    if-nez p2, :cond_70

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->M_()Z

    move-result p2

    if-eqz p2, :cond_70

    .line 881
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p2, p1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p2

    .line 882
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v0, p1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result p1

    .line 883
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    .line 884
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p0

    if-gt p1, v0, :cond_5f

    if-ge p2, v0, :cond_5f

    move v3, v2

    goto :goto_60

    :cond_5f
    move v3, v1

    :goto_60
    if-lt p2, p0, :cond_65

    if-le p1, p0, :cond_65

    move v1, v2

    :cond_65
    if-nez v3, :cond_69

    if-eqz v1, :cond_70

    .line 890
    :cond_69
    iget-boolean p1, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-eqz p1, :cond_6e

    move v0, p0

    :cond_6e
    iput v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    :cond_70
    return v2

    :cond_71
    return v1
.end method

.method private setSessionImpl()Landroid/view/View;
    .registers 2

    .line 1943
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v0, :cond_9

    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer()Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 1944
    :cond_9
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private write(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I
    .registers 6

    .line 1014
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    sub-int v0, p1, v0

    if-lez v0, :cond_23

    .line 1018
    invoke-direct {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p2

    neg-int p2, p2

    if-eqz p4, :cond_22

    add-int/2addr p1, p2

    .line 1025
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p3

    sub-int/2addr p1, p3

    if-lez p1, :cond_22

    .line 1027
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    neg-int p3, p1

    invoke-virtual {p0, p3}, Lo/UIntDeserializer;->read(I)V

    sub-int/2addr p2, p1

    :cond_22
    return p2

    :cond_23
    const/4 p0, 0x0

    return p0
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I
    .registers 12

    .line 1607
    iget v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 1608
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_16

    .line 1610
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-gez v1, :cond_13

    .line 1611
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    add-int/2addr v1, v3

    iput v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    .line 1613
    :cond_13
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;)V

    .line 1615
    :cond_16
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    add-int/2addr v1, v3

    .line 1616
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager$read;

    .line 1617
    :cond_1d
    iget-boolean v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->read:Z

    if-nez v4, :cond_23

    if-lez v1, :cond_74

    :cond_23
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Z

    move-result v4

    if-eqz v4, :cond_74

    .line 1618
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager$read;->RemoteActionCompatParcelizer()V

    .line 1622
    invoke-virtual {p0, p1, p3, p2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/LinearLayoutManager$read;)V

    .line 1626
    iget-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$read;->read:Z

    if-nez v4, :cond_74

    .line 1629
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    iget v6, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    mul-int/2addr v5, v6

    add-int/2addr v4, v5

    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1636
    iget-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$read;->IconCompatParcelizer:Z

    if-eqz v4, :cond_4b

    iget-object v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    if-nez v4, :cond_4b

    .line 1637
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v4

    if-nez v4, :cond_55

    .line 1638
    :cond_4b
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    iget v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    sub-int/2addr v4, v5

    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 1640
    iget v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    sub-int/2addr v1, v4

    .line 1643
    :cond_55
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    if-eq v4, v2, :cond_6e

    .line 1644
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    iget v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    add-int/2addr v4, v5

    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    .line 1645
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-gez v4, :cond_6b

    .line 1646
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    iget v5, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    add-int/2addr v4, v5

    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    .line 1648
    :cond_6b
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;)V

    :cond_6e
    if-eqz p4, :cond_1d

    .line 1650
    iget-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$read;->write:Z

    if-eqz v4, :cond_1d

    .line 1657
    :cond_74
    iget p0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    sub-int/2addr v0, p0

    return v0
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V
    .registers 8

    .line 1537
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-ltz p2, :cond_50

    .line 1545
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->write()I

    move-result v1

    sub-int/2addr v1, p2

    add-int/2addr v1, p3

    .line 1546
    iget-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz p2, :cond_31

    const/4 p2, 0x0

    move p3, p2

    :goto_14
    if-ge p3, v0, :cond_50

    .line 1548
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v2

    .line 1549
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v3, v2}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v3

    if-lt v3, v1, :cond_2d

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 1550
    invoke-virtual {v3, v2}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)I

    move-result v2

    if-lt v2, v1, :cond_2d

    add-int/lit8 p3, p3, 0x1

    goto :goto_14

    .line 1552
    :cond_2d
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V

    return-void

    :cond_31
    add-int/lit8 v0, v0, -0x1

    move p2, v0

    :goto_34
    if-ltz p2, :cond_50

    .line 1558
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p3

    .line 1559
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v2, p3}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v2

    if-lt v2, v1, :cond_4d

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 1560
    invoke-virtual {v2, p3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)I

    move-result p3

    if-lt p3, v1, :cond_4d

    add-int/lit8 p2, p2, -0x1

    goto :goto_34

    .line 1562
    :cond_4d
    invoke-direct {p0, p1, v0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;II)V

    :cond_50
    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1164
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;
    .registers 8

    .line 2100
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->PlaybackStateCompat()V

    .line 2101
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_b

    return-object v0

    .line 2105
    :cond_b
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(I)I

    move-result p1

    const/high16 p2, -0x80000000

    if-ne p1, p2, :cond_14

    return-object v0

    .line 2109
    :cond_14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 2110
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v1

    int-to-float v1, v1

    const v2, 0x3eaaaaab

    mul-float/2addr v1, v2

    float-to-int v1, v1

    const/4 v2, 0x0

    .line 2111
    invoke-direct {p0, p1, v1, v2, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(IIZLandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 2112
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput p2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    .line 2113
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput-boolean v2, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->RatingCompat:Z

    .line 2114
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    const/4 v1, 0x1

    invoke-direct {p0, p3, p2, p4, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3d

    .line 2122
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onStop()Landroid/view/View;

    move-result-object p3

    goto :goto_41

    .line 2124
    :cond_3d
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->setSessionImpl()Landroid/view/View;

    move-result-object p3

    :goto_41
    if-ne p1, p2, :cond_48

    .line 2130
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onSkipToPrevious()Landroid/view/View;

    move-result-object p0

    goto :goto_4c

    .line 2132
    :cond_48
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onSkipToQueueItem()Landroid/view/View;

    move-result-object p0

    .line 2134
    :goto_4c
    invoke-virtual {p0}, Landroid/view/View;->hasFocusable()Z

    move-result p1

    if-eqz p1, :cond_56

    if-nez p3, :cond_55

    return-object v0

    :cond_55
    return-object p0

    :cond_56
    return-object p3
.end method

.method public final AudioAttributesCompatParcelizer(I)V
    .registers 2

    .line 1380
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer:I

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(IILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;)V
    .registers 6

    .line 1402
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-eqz v0, :cond_5

    move p1, p2

    .line 1403
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p2

    if-eqz p2, :cond_22

    if-eqz p1, :cond_22

    .line 1408
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    const/4 p2, 0x1

    if-lez p1, :cond_15

    move v0, p2

    goto :goto_16

    :cond_15
    const/4 v0, -0x1

    .line 1410
    :goto_16
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    .line 1411
    invoke-direct {p0, v0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(IIZLandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 1412
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-virtual {p0, p3, p1, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;)V

    :cond_22
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;)V
    .registers 8

    .line 1323
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1325
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write:Z

    .line 1326
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    goto :goto_24

    .line 1328
    :cond_15
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->PlaybackStateCompat()V

    .line 1329
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 1330
    iget v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne v3, v2, :cond_24

    if-eqz v0, :cond_23

    add-int/lit8 v3, p1, -0x1

    goto :goto_24

    :cond_23
    move v3, v1

    :cond_24
    :goto_24
    if-nez v0, :cond_27

    const/4 v2, 0x1

    :cond_27
    move v0, v1

    .line 1341
    :goto_28
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer:I

    if-ge v0, v4, :cond_37

    if-ltz v3, :cond_37

    if-ge v3, p1, :cond_37

    .line 1343
    invoke-interface {p2, v3, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;->read(II)V

    add-int/2addr v3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_28

    :cond_37
    return-void
.end method

.method AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;I)V
    .registers 5

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 4

    .line 523
    new-instance v0, Lo/deserializeKeylj4SQcc;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lo/deserializeKeylj4SQcc;-><init>(Landroid/content/Context;)V

    .line 524
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer(I)V

    .line 525
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onCustomAction;)V

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer(I)V
    .registers 4

    if-eqz p1, :cond_16

    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    goto :goto_16

    .line 359
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid orientation:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_16
    :goto_16
    const/4 v0, 0x0

    .line 362
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 364
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne p1, v0, :cond_23

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    if-eqz v0, :cond_23

    return-void

    .line 366
    :cond_23
    invoke-static {p0, p1}, Lo/UIntDeserializer;->write(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;I)Lo/UIntDeserializer;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 367
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    iput-object v0, v1, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    .line 368
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    .line 369
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method public AudioAttributesImplApi21Parcelizer()Z
    .registers 2

    .line 321
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_6

    return v0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Z
    .registers 1

    .line 313
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-nez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1182
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method final AudioAttributesImplBaseParcelizer()V
    .registers 2

    .line 1068
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    if-nez v0, :cond_a

    .line 1069
    invoke-static {}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaSessionCompatToken()Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    :cond_a
    return-void
.end method

.method final IconCompatParcelizer(I)I
    .registers 6

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3f

    const/4 v2, 0x2

    if-eq p1, v2, :cond_32

    const/16 v2, 0x11

    const/high16 v3, -0x80000000

    if-eq p1, v2, :cond_2c

    const/16 v2, 0x21

    if-eq p1, v2, :cond_26

    const/16 v0, 0x42

    if-eq p1, v0, :cond_20

    const/16 v0, 0x82

    if-eq p1, v0, :cond_1a

    return v3

    .line 1772
    :cond_1a
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne p0, v1, :cond_1f

    return v1

    :cond_1f
    return v3

    .line 1778
    :cond_20
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-nez p0, :cond_25

    return v1

    :cond_25
    return v3

    .line 1769
    :cond_26
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne p0, v1, :cond_2b

    return v0

    :cond_2b
    return v3

    .line 1775
    :cond_2c
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-nez p0, :cond_31

    return v0

    :cond_31
    return v3

    .line 1761
    :cond_32
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne p1, v1, :cond_37

    return v1

    .line 1763
    :cond_37
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_3e

    return v0

    :cond_3e
    return v1

    .line 1753
    :cond_3f
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne p1, v1, :cond_44

    return v0

    .line 1755
    :cond_44
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_4b

    return v1

    :cond_4b
    return v0
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1188
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public IconCompatParcelizer(Landroid/os/Parcelable;)V
    .registers 4

    .line 294
    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_13

    .line 295
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 296
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_10

    .line 297
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->RemoteActionCompatParcelizer()V

    .line 299
    :cond_10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    :cond_13
    return-void
.end method

.method public final IconCompatParcelizer(Ljava/lang/String;)V
    .registers 3

    .line 1444
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_7

    .line 1445
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method public M_()Z
    .registers 2

    .line 2209
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_c

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer:Z

    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    if-ne v0, p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()I
    .registers 4

    .line 1998
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_e

    const/4 p0, -0x1

    return p0

    .line 1999
    :cond_e
    invoke-static {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()I
    .registers 4

    .line 1981
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_e

    const/4 p0, -0x1

    return p0

    .line 1982
    :cond_e
    invoke-static {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1176
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final MediaBrowserCompatMediaItem()I
    .registers 5

    .line 2038
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {p0, v0, v3, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_f

    return v3

    .line 2039
    :cond_f
    invoke-static {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()I
    .registers 1

    .line 348
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    return p0
.end method

.method protected final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z
    .registers 2

    .line 1064
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromSearch()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_8

    return v0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaDescriptionCompat()Z
    .registers 1

    .line 394
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onFastForward:Z

    return p0
.end method

.method public final MediaMetadataCompat()I
    .registers 5

    .line 2021
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {p0, v0, v3, v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(IIZZ)Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_f

    return v3

    .line 2022
    :cond_f
    invoke-static {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public RatingCompat()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 5

    .line 1155
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 1158
    :cond_6
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1170
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public RemoteActionCompatParcelizer(I)Landroid/graphics/PointF;
    .registers 5

    .line 531
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    const/4 v0, 0x0

    .line 534
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    if-ge p1, v1, :cond_15

    move v0, v2

    .line 535
    :cond_15
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eq v0, p1, :cond_1a

    const/4 v2, -0x1

    .line 536
    :cond_1a
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 p1, 0x0

    if-nez p0, :cond_26

    .line 537
    new-instance p0, Landroid/graphics/PointF;

    int-to-float v0, v2

    invoke-direct {p0, v0, p1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p0

    .line 539
    :cond_26
    new-instance p0, Landroid/graphics/PointF;

    int-to-float v0, v2

    invoke-direct {p0, p1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 256
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 257
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-lez v0, :cond_17

    .line 258
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 259
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaMetadataCompat()I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    :cond_17
    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;[I)V
    .registers 5

    .line 507
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p1

    .line 508
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p0, v0, :cond_e

    move p0, v1

    goto :goto_10

    :cond_e
    move p0, p1

    move p1, v1

    .line 514
    :goto_10
    aput p1, p2, v1

    const/4 p1, 0x1

    .line 515
    aput p0, p2, p1

    return-void
.end method

.method final handleMediaPlayPauseIfPendingOnHandler()Z
    .registers 3

    .line 1735
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onFastForward()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_16

    .line 1736
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSeekTo()I

    move-result v0

    if-eq v0, v1, :cond_16

    .line 1737
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onRemoveQueueItemAt()Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public onAddQueueItem()Landroid/os/Parcelable;
    .registers 4

    .line 266
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_c

    .line 267
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;)V

    return-object v0

    .line 269
    :cond_c
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;-><init>()V

    .line 270
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v1

    if-lez v1, :cond_57

    .line 271
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 272
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer:Z

    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    xor-int/2addr v1, v2

    .line 273
    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write:Z

    if-eqz v1, :cond_3d

    .line 275
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onSkipToQueueItem()Landroid/view/View;

    move-result-object v1

    .line 276
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v2}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v2

    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 277
    invoke-virtual {p0, v1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result p0

    sub-int/2addr v2, p0

    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer:I

    .line 278
    invoke-static {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    iput p0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    return-object v0

    .line 280
    :cond_3d
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onSkipToPrevious()Landroid/view/View;

    move-result-object v1

    .line 281
    invoke-static {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v2

    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    .line 282
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v2, v1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v1

    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 283
    invoke-virtual {p0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p0

    sub-int/2addr v1, p0

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer:I

    return-object v0

    .line 286
    :cond_57
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->RemoteActionCompatParcelizer()V

    return-object v0
.end method

.method public final onCommand()V
    .registers 2

    const/4 v0, 0x0

    .line 1247
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onMediaButtonEvent:Z

    return-void
.end method

.method public read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 6

    .line 1142
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    const/4 p0, 0x0

    return p0

    .line 1145
    :cond_7
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1194
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public read()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 2

    .line 211
    new-instance p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v0, -0x2

    invoke-direct {p0, v0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    return-object p0
.end method

.method public read(I)V
    .registers 2

    .line 1098
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    const/high16 p1, -0x80000000

    .line 1099
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 1100
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz p1, :cond_d

    .line 1101
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->RemoteActionCompatParcelizer()V

    .line 1103
    :cond_d
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method public read(II)V
    .registers 3

    .line 1126
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 1127
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 1128
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz p1, :cond_b

    .line 1129
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->RemoteActionCompatParcelizer()V

    .line 1131
    :cond_b
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;)V
    .registers 4

    .line 1311
    iget p0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    if-ltz p0, :cond_14

    .line 1312
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p1

    if-ge p0, p1, :cond_14

    const/4 p1, 0x0

    .line 1313
    iget p2, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-interface {p3, p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;->read(II)V

    :cond_14
    return-void
.end method

.method public final read(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 3

    .line 246
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    return-void
.end method

.method public final write(I)Landroid/view/View;
    .registers 4

    .line 426
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    const/4 v1, 0x0

    .line 430
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v1

    sub-int v1, p1, v1

    if-ltz v1, :cond_22

    if-ge v1, v0, :cond_22

    .line 433
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v0

    .line 434
    invoke-static {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v1

    if-ne v1, p1, :cond_22

    return-object v0

    .line 439
    :cond_22
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;ZZ)Landroid/view/View;
    .registers 21

    move-object/from16 v0, p0

    .line 1868
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 1872
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p4, :cond_15

    .line 1875
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v1

    sub-int/2addr v1, v3

    const/4 v4, -0x1

    move v5, v4

    goto :goto_18

    :cond_15
    move v4, v1

    move v1, v2

    move v5, v3

    .line 1880
    :goto_18
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v6

    .line 1882
    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v7}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v7

    .line 1883
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v8}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v8

    const/4 v9, 0x0

    move-object v10, v9

    move-object v11, v10

    :goto_2b
    if-eq v1, v4, :cond_78

    .line 1890
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v12

    .line 1891
    invoke-static {v12}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v13

    .line 1892
    iget-object v14, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v14, v12}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v14

    .line 1893
    iget-object v15, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v15, v12}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v15

    if-ltz v13, :cond_76

    if-ge v13, v6, :cond_76

    .line 1895
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {v13}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v13

    if-eqz v13, :cond_55

    if-nez v11, :cond_76

    move-object v11, v12

    goto :goto_76

    :cond_55
    if-gt v15, v7, :cond_5b

    if-ge v14, v7, :cond_5b

    move v13, v3

    goto :goto_5c

    :cond_5b
    move v13, v2

    :goto_5c
    if-lt v14, v8, :cond_62

    if-le v15, v8, :cond_62

    move v14, v3

    goto :goto_63

    :cond_62
    move v14, v2

    :goto_63
    if-nez v13, :cond_68

    if-nez v14, :cond_68

    return-object v12

    :cond_68
    if-eqz p3, :cond_6f

    if-nez v14, :cond_71

    if-nez v9, :cond_76

    goto :goto_75

    :cond_6f
    if-eqz v13, :cond_73

    :cond_71
    move-object v10, v12

    goto :goto_76

    :cond_73
    if-nez v9, :cond_76

    :goto_75
    move-object v9, v12

    :cond_76
    :goto_76
    add-int/2addr v1, v5

    goto :goto_2b

    :cond_78
    if-eqz v9, :cond_7b

    return-object v9

    :cond_7b
    if-eqz v10, :cond_7e

    return-object v10

    :cond_7e
    return-object v11
.end method

.method public write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 2

    .line 748
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    const/4 p1, 0x0

    .line 749
    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    const/4 p1, -0x1

    .line 750
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    const/high16 p1, -0x80000000

    .line 751
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 752
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 11

    .line 559
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    const/4 v1, -0x1

    if-nez v0, :cond_9

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-eq v0, v1, :cond_13

    .line 560
    :cond_9
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v0

    if-nez v0, :cond_13

    .line 561
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    return-void

    .line 565
    :cond_13
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write()Z

    move-result v0

    if-eqz v0, :cond_23

    .line 566
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 569
    :cond_23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 570
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    const/4 v2, 0x0

    iput-boolean v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->RatingCompat:Z

    .line 572
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->PlaybackStateCompat()V

    .line 574
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromMediaId()Landroid/view/View;

    move-result-object v0

    .line 575
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    iget-boolean v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->read:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_69

    iget v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne v3, v1, :cond_69

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-nez v3, :cond_69

    if-eqz v0, :cond_80

    .line 582
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v3, v0}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v3

    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 583
    invoke-virtual {v5}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v5

    if-ge v3, v5, :cond_5f

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 584
    invoke-virtual {v3, v0}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v3

    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 585
    invoke-virtual {v5}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v5

    if-gt v3, v5, :cond_80

    .line 597
    :cond_5f
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-static {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v5

    invoke-virtual {v3, v0, v5}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write(Landroid/view/View;I)V

    goto :goto_80

    .line 577
    :cond_69
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    .line 578
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    iget-boolean v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    xor-int/2addr v3, v5

    iput-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    .line 580
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)V

    .line 581
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    iput-boolean v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->read:Z

    .line 606
    :cond_80
    :goto_80
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    if-ltz v3, :cond_88

    move v3, v4

    goto :goto_89

    :cond_88
    move v3, v1

    .line 607
    :goto_89
    iput v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 608
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCommand:[I

    aput v2, v0, v2

    .line 609
    aput v2, v0, v4

    .line 610
    invoke-virtual {p0, p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;[I)V

    .line 611
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCommand:[I

    aget v0, v0, v2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 612
    invoke-virtual {v3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v3

    add-int/2addr v0, v3

    .line 613
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCommand:[I

    aget v3, v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 614
    invoke-virtual {v5}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer()I

    move-result v5

    add-int/2addr v3, v5

    .line 615
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v5

    if-eqz v5, :cond_f1

    iget v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-eq v5, v1, :cond_f1

    iget v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    const/high16 v7, -0x80000000

    if-eq v6, v7, :cond_f1

    .line 620
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_f1

    .line 624
    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v6, :cond_dc

    .line 625
    iget-object v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v6}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v6

    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 626
    invoke-virtual {v7, v5}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v5

    sub-int/2addr v6, v5

    .line 627
    iget v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    goto :goto_eb

    .line 629
    :cond_dc
    iget-object v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v6, v5}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 630
    invoke-virtual {v6}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v6

    sub-int/2addr v5, v6

    .line 631
    iget v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    :goto_eb
    sub-int/2addr v6, v5

    if-lez v6, :cond_f0

    add-int/2addr v0, v6

    goto :goto_f1

    :cond_f0
    sub-int/2addr v3, v6

    .line 643
    :cond_f1
    :goto_f1
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    iget-boolean v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-eqz v5, :cond_fc

    .line 644
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v5, :cond_102

    goto :goto_101

    .line 647
    :cond_fc
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v5, :cond_101

    goto :goto_102

    :cond_101
    :goto_101
    move v1, v4

    .line 651
    :cond_102
    :goto_102
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0, p1, p2, v5, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;I)V

    .line 652
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 653
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ParcelableVolumeInfo()Z

    move-result v5

    iput-boolean v5, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->read:Z

    .line 654
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v5

    iput-boolean v5, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Z

    .line 657
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    .line 658
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    iget-boolean v1, v1, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-eqz v1, :cond_17d

    .line 660
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)V

    .line 661
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v0, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 662
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0, p1, v0, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    .line 663
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 664
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v1, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 665
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-lez v5, :cond_145

    .line 666
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    add-int/2addr v3, v5

    .line 669
    :cond_145
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-direct {p0, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)V

    .line 670
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v3, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 671
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    iget-object v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v6, v6, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v5, v6

    iput v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 672
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0, p1, v3, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    .line 673
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 675
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-lez v5, :cond_1d5

    .line 677
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 678
    invoke-direct {p0, v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer(II)V

    .line 679
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 680
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0, p1, v0, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    .line 681
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    goto :goto_1d5

    .line 685
    :cond_17d
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)V

    .line 686
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v3, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 687
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0, p1, v1, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    .line 688
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v3, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 689
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v1, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 690
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-lez v5, :cond_19e

    .line 691
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    add-int/2addr v0, v5

    .line 694
    :cond_19e
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-direct {p0, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;)V

    .line 695
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v0, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 696
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    iget-object v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v6, v6, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v5, v6

    iput v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 697
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0, p1, v0, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    .line 698
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 700
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-lez v5, :cond_1d5

    .line 701
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 703
    invoke-direct {p0, v1, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi26Parcelizer(II)V

    .line 704
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iput v5, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 705
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p0, p1, v1, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    .line 706
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onCustomAction:Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;

    iget v3, v1, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 713
    :cond_1d5
    :goto_1d5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v1

    if-lez v1, :cond_1f9

    .line 717
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    xor-int/2addr v1, v5

    if-eqz v1, :cond_1ed

    .line 718
    invoke-direct {p0, v3, p1, p2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v3, v1

    .line 721
    invoke-direct {p0, v0, p1, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    move-result v1

    goto :goto_1f7

    .line 725
    :cond_1ed
    invoke-direct {p0, v0, p1, p2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v3, v1

    .line 728
    invoke-direct {p0, v3, p1, p2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)I

    move-result v1

    :goto_1f7
    add-int/2addr v0, v1

    add-int/2addr v3, v1

    .line 733
    :cond_1f9
    invoke-direct {p0, p1, p2, v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;II)V

    .line 734
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p1

    if-nez p1, :cond_208

    .line 735
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->AudioAttributesImplBaseParcelizer()V

    goto :goto_20d

    .line 737
    :cond_208
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->read:Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    .line 739
    :goto_20d
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer:Z

    return-void
.end method

.method write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/LinearLayoutManager$read;)V
    .registers 12

    .line 1662
    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p1, :cond_a

    .line 1669
    iput-boolean p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->read:Z

    return-void

    .line 1672
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1673
    iget-object v1, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-nez v1, :cond_29

    .line 1674
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    iget v4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v4, v3, :cond_1e

    move v4, p2

    goto :goto_1f

    :cond_1e
    move v4, v2

    :goto_1f
    if-ne v1, v4, :cond_25

    .line 1676
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    goto :goto_3b

    .line 1678
    :cond_25
    invoke-virtual {p0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/View;I)V

    goto :goto_3b

    .line 1681
    :cond_29
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    iget v4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v4, v3, :cond_31

    move v4, p2

    goto :goto_32

    :cond_31
    move v4, v2

    :goto_32
    if-ne v1, v4, :cond_38

    .line 1683
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    goto :goto_3b

    .line 1685
    :cond_38
    invoke-virtual {p0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    .line 1688
    :goto_3b
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onCommand(Landroid/view/View;)V

    .line 1689
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1, p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v1

    iput v1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    .line 1691
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne v1, p2, :cond_87

    .line 1692
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v1

    if-eqz v1, :cond_62

    .line 1693
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1694
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0, p1}, Lo/UIntDeserializer;->write(Landroid/view/View;)I

    move-result p0

    sub-int p0, v1, p0

    goto :goto_70

    .line 1696
    :cond_62
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v1

    .line 1697
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0, p1}, Lo/UIntDeserializer;->write(Landroid/view/View;)I

    move-result p0

    add-int/2addr p0, v1

    move v5, v1

    move v1, p0

    move p0, v5

    .line 1699
    :goto_70
    iget v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v2, v3, :cond_7c

    .line 1700
    iget v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1701
    iget p3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget v3, p4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    sub-int/2addr p3, v3

    goto :goto_b0

    .line 1703
    :cond_7c
    iget v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1704
    iget p3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget v3, p4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    add-int/2addr p3, v3

    move v5, v2

    move v2, p3

    move p3, v5

    goto :goto_b0

    .line 1707
    :cond_87
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v1

    .line 1708
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {p0, p1}, Lo/UIntDeserializer;->write(Landroid/view/View;)I

    move-result p0

    add-int/2addr p0, v1

    .line 1710
    iget v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v2, v3, :cond_a3

    .line 1711
    iget v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1712
    iget p3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget v3, p4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    sub-int/2addr p3, v3

    move v5, v2

    move v2, p0

    move p0, p3

    move p3, v1

    move v1, v5

    goto :goto_b0

    .line 1714
    :cond_a3
    iget v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1715
    iget p3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget v3, p4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    add-int/2addr p3, v3

    move v5, v2

    move v2, p0

    move p0, v5

    move v6, v1

    move v1, p3

    move p3, v6

    .line 1720
    :goto_b0
    invoke-static {p1, p0, p3, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroid/view/View;IIII)V

    .line 1727
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result p0

    if-nez p0, :cond_bf

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->P_()Z

    move-result p0

    if-eqz p0, :cond_c1

    .line 1728
    :cond_bf
    iput-boolean p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->IconCompatParcelizer:Z

    .line 1730
    :cond_c1
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    move-result p0

    iput-boolean p0, p4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->write:Z

    return-void
.end method

.method public write(Z)V
    .registers 3

    const/4 v0, 0x0

    .line 328
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 329
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    if-ne v0, p1, :cond_9

    return-void

    .line 332
    :cond_9
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->onPlay:Z

    .line 333
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

###### Class androidx.recyclerview.widget.LinearLayoutManager.IconCompatParcelizer (androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer)
.class final Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/LinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Z

.field IconCompatParcelizer:I

.field RemoteActionCompatParcelizer:I

.field read:Z

.field write:Lo/UIntDeserializer;


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2515
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2516
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method static write(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Z
    .registers 3

    .line 2547
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 2548
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v0

    if-nez v0, :cond_1e

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result v0

    if-ltz v0, :cond_1e

    .line 2549
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result p0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p1

    if-ge p0, p1, :cond_1e

    const/4 p0, 0x1

    return p0

    :cond_1e
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method final RemoteActionCompatParcelizer()V
    .registers 2

    const/4 v0, -0x1

    .line 2520
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    const/high16 v0, -0x80000000

    .line 2521
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    const/4 v0, 0x0

    .line 2522
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    .line 2523
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->read:Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;I)V
    .registers 4

    .line 2600
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-eqz v0, :cond_14

    .line 2601
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v0, p1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    .line 2602
    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi26Parcelizer()I

    move-result v0

    add-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    goto :goto_1c

    .line 2604
    :cond_14
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v0, p1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 2607
    :goto_1c
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 2538
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnchorInfo{mPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCoordinate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLayoutFromEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mValid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->read:Z

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method final write()V
    .registers 2

    .line 2531
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-eqz v0, :cond_b

    .line 2532
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v0

    goto :goto_11

    .line 2533
    :cond_b
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    :goto_11
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method public final write(Landroid/view/View;I)V
    .registers 9

    .line 2553
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi26Parcelizer()I

    move-result v0

    if-ltz v0, :cond_c

    .line 2555
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    return-void

    .line 2558
    :cond_c
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    .line 2559
    iget-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    const/4 v1, 0x0

    if-eqz p2, :cond_55

    .line 2560
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {p2}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p2

    sub-int/2addr p2, v0

    .line 2561
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v0, p1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v0

    sub-int/2addr p2, v0

    .line 2563
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v0

    sub-int/2addr v0, p2

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    if-lez p2, :cond_94

    .line 2566
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v0, p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v0

    .line 2567
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 2568
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v3

    .line 2569
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v4, p1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v2, v0

    sub-int/2addr p1, v3

    .line 2571
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/2addr v3, p1

    sub-int/2addr v2, v3

    if-gez v2, :cond_94

    .line 2575
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    neg-int v0, v2

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    return-void

    .line 2579
    :cond_55
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {p2, p1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p2

    .line 2580
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v2}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    sub-int v2, p2, v2

    .line 2581
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    if-lez v2, :cond_94

    .line 2583
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    .line 2584
    invoke-virtual {v3, p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v3

    .line 2585
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v4}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v4

    .line 2587
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    .line 2588
    invoke-virtual {v5, p1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result p1

    .line 2589
    iget-object v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->write:Lo/UIntDeserializer;

    invoke-virtual {v5}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v5

    sub-int/2addr v4, v0

    sub-int/2addr v4, p1

    .line 2590
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int/2addr v5, p1

    add-int/2addr p2, v3

    sub-int/2addr v5, p2

    if-gez v5, :cond_94

    .line 2593
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    neg-int p2, v5

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    :cond_94
    return-void
.end method

###### Class androidx.recyclerview.widget.LinearLayoutManager.RemoteActionCompatParcelizer (androidx.recyclerview.widget.LinearLayoutManager$RemoteActionCompatParcelizer)
.class final Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/LinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:I

.field AudioAttributesImplApi21Parcelizer:I

.field AudioAttributesImplApi26Parcelizer:I

.field AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:I

.field MediaBrowserCompatCustomActionResultReceiver:I

.field MediaBrowserCompatItemReceiver:I

.field MediaBrowserCompatSearchResultReceiver:I

.field MediaDescriptionCompat:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation
.end field

.field RatingCompat:Z

.field RemoteActionCompatParcelizer:Z

.field read:Z

.field write:I


# direct methods
.method constructor <init>()V
    .registers 2

    .line 2252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2271
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->RatingCompat:Z

    const/4 v0, 0x0

    .line 2312
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 2319
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    .line 2326
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Z

    const/4 v0, 0x0

    .line 2338
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;)V
    .registers 2

    .line 2396
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->read(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_a

    const/4 p1, -0x1

    .line 2398
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    return-void

    .line 2400
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 2401
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    return-void
.end method

.method private RemoteActionCompatParcelizer()Landroid/view/View;
    .registers 6

    .line 2375
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_2e

    .line 2377
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 2379
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 2380
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v4

    if-nez v4, :cond_2b

    .line 2383
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result v3

    if-ne v4, v3, :cond_2b

    .line 2384
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    return-object v2

    :cond_2b
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_2e
    const/4 p0, 0x0

    return-object p0
.end method

.method private read(Landroid/view/View;)Landroid/view/View;
    .registers 9

    .line 2406
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    :goto_b
    if-ge v3, v0, :cond_3d

    .line 2413
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 2415
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eq v4, p1, :cond_3a

    .line 2416
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v6

    if-eqz v6, :cond_26

    goto :goto_3a

    .line 2419
    :cond_26
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result v5

    iget v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    sub-int/2addr v5, v6

    iget v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    mul-int/2addr v5, v6

    if-gez v5, :cond_33

    goto :goto_3a

    :cond_33
    if-ge v5, v2, :cond_3a

    if-nez v5, :cond_38

    return-object v4

    :cond_38
    move-object v1, v4

    move v2, v5

    :cond_3a
    :goto_3a
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_3d
    return-object v1
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)Landroid/view/View;
    .registers 4

    .line 2359
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    if-eqz v0, :cond_9

    .line 2360
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 2362
    :cond_9
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(I)Landroid/view/View;

    move-result-object p1

    .line 2363
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    return-object p1
.end method

.method public final IconCompatParcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 2392
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    return-void
.end method

.method final write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Z
    .registers 2

    .line 2349
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    if-ltz p0, :cond_c

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p1

    if-ge p0, p1, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.recyclerview.widget.LinearLayoutManager.SavedState (androidx.recyclerview.widget.LinearLayoutManager$SavedState)
.class public Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/LinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:I

.field IconCompatParcelizer:I

.field write:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 2491
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState$3;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState$3;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 2454
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 2458
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2459
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    .line 2460
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer:I

    .line 2461
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_17

    const/4 v0, 0x0

    :cond_17
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write:Z

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;)V
    .registers 3

    .line 2465
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2466
    iget v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    .line 2467
    iget v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer:I

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer:I

    .line 2468
    iget-boolean p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write:Z

    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write:Z

    return-void
.end method


# virtual methods
.method final RemoteActionCompatParcelizer()V
    .registers 2

    const/4 v0, -0x1

    .line 2476
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    return-void
.end method

.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method final write()Z
    .registers 1

    .line 2472
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    if-ltz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 2486
    iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2487
    iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2488
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->write:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.recyclerview.widget.LinearLayoutManager.SavedState.AnonymousClass3 (androidx.recyclerview.widget.LinearLayoutManager$SavedState$3)
.class final Landroidx/recyclerview/widget/LinearLayoutManager$SavedState$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2492
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(I)[Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;
    .registers 1

    .line 2500
    new-array p0, p0, [Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;
    .registers 2

    .line 2495
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 2492
    invoke-static {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState$3;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 2492
    invoke-static {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState$3;->IconCompatParcelizer(I)[Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.recyclerview.widget.LinearLayoutManager.read (androidx.recyclerview.widget.LinearLayoutManager$read)
.class public final Landroidx/recyclerview/widget/LinearLayoutManager$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/LinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "read"
.end annotation


# instance fields
.field public AudioAttributesCompatParcelizer:I

.field public IconCompatParcelizer:Z

.field public read:Z

.field public write:Z


# direct methods
.method protected constructor <init>()V
    .registers 1

    .line 2611
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final RemoteActionCompatParcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 2618
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    .line 2619
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$read;->read:Z

    .line 2620
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$read;->IconCompatParcelizer:Z

    .line 2621
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$read;->write:Z

    return-void
.end method
