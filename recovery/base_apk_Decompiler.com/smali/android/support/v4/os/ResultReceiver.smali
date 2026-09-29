###### Class android.support.v4.os.ResultReceiver (android.support.v4.os.ResultReceiver)
.class public Landroid/support/v4/os/ResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/os/ResultReceiver$read;,
        Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/os/ResultReceiver;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final IconCompatParcelizer:Landroid/os/Handler;

.field final read:Z

.field write:Lo/AudioAttributesImplApi21Parcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 150
    new-instance v0, Landroid/support/v4/os/ResultReceiver$2;

    invoke-direct {v0}, Landroid/support/v4/os/ResultReceiver$2;-><init>()V

    sput-object v0, Landroid/support/v4/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 142
    iput-boolean v0, p0, Landroid/support/v4/os/ResultReceiver;->read:Z

    const/4 v0, 0x0

    .line 143
    iput-object v0, p0, Landroid/support/v4/os/ResultReceiver;->IconCompatParcelizer:Landroid/os/Handler;

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lo/AudioAttributesImplApi21Parcelizer$read;->IconCompatParcelizer(Landroid/os/IBinder;)Lo/AudioAttributesImplApi21Parcelizer;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v4/os/ResultReceiver;->write:Lo/AudioAttributesImplApi21Parcelizer;

    return-void
.end method


# virtual methods
.method protected AudioAttributesCompatParcelizer(ILandroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 132
    monitor-enter p0

    .line 133
    :try_start_1
    iget-object p2, p0, Landroid/support/v4/os/ResultReceiver;->write:Lo/AudioAttributesImplApi21Parcelizer;

    if-nez p2, :cond_c

    .line 134
    new-instance p2, Landroid/support/v4/os/ResultReceiver$read;

    invoke-direct {p2, p0}, Landroid/support/v4/os/ResultReceiver$read;-><init>(Landroid/support/v4/os/ResultReceiver;)V

    iput-object p2, p0, Landroid/support/v4/os/ResultReceiver;->write:Lo/AudioAttributesImplApi21Parcelizer;

    .line 136
    :cond_c
    iget-object p2, p0, Landroid/support/v4/os/ResultReceiver;->write:Lo/AudioAttributesImplApi21Parcelizer;

    invoke-interface {p2}, Lo/AudioAttributesImplApi21Parcelizer;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_17

    .line 137
    monitor-exit p0

    return-void

    :catchall_17
    move-exception p1

    monitor-exit p0

    throw p1
.end method

###### Class android.support.v4.os.ResultReceiver.AnonymousClass2 (android.support.v4.os.ResultReceiver$2)
.class final Landroid/support/v4/os/ResultReceiver$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/os/ResultReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/os/ResultReceiver;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/os/ResultReceiver;
    .registers 2

    .line 154
    new-instance v0, Landroid/support/v4/os/ResultReceiver;

    invoke-direct {v0, p0}, Landroid/support/v4/os/ResultReceiver;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroid/support/v4/os/ResultReceiver;
    .registers 1

    .line 158
    new-array p0, p0, [Landroid/support/v4/os/ResultReceiver;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 151
    invoke-static {p1}, Landroid/support/v4/os/ResultReceiver$2;->IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/os/ResultReceiver;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 151
    invoke-static {p1}, Landroid/support/v4/os/ResultReceiver$2;->RemoteActionCompatParcelizer(I)[Landroid/support/v4/os/ResultReceiver;

    move-result-object p0

    return-object p0
.end method

###### Class android.support.v4.os.ResultReceiver.IconCompatParcelizer (android.support.v4.os.ResultReceiver$IconCompatParcelizer)
.class final Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/os/ResultReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final IconCompatParcelizer:Landroid/os/Bundle;

.field final synthetic RemoteActionCompatParcelizer:Landroid/support/v4/os/ResultReceiver;

.field final write:I


# direct methods
.method constructor <init>(Landroid/support/v4/os/ResultReceiver;ILandroid/os/Bundle;)V
    .registers 4

    .line 57
    iput-object p1, p0, Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/os/ResultReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput p2, p0, Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;->write:I

    .line 59
    iput-object p3, p0, Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;->IconCompatParcelizer:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 64
    iget-object v0, p0, Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/os/ResultReceiver;

    iget v1, p0, Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;->write:I

    iget-object p0, p0, Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;->IconCompatParcelizer:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p0}, Landroid/support/v4/os/ResultReceiver;->AudioAttributesCompatParcelizer(ILandroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.os.ResultReceiver.read (android.support.v4.os.ResultReceiver$read)
.class final Landroid/support/v4/os/ResultReceiver$read;
.super Lo/AudioAttributesImplApi21Parcelizer$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/os/ResultReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic write:Landroid/support/v4/os/ResultReceiver;


# direct methods
.method constructor <init>(Landroid/support/v4/os/ResultReceiver;)V
    .registers 2

    .line 68
    iput-object p1, p0, Landroid/support/v4/os/ResultReceiver$read;->write:Landroid/support/v4/os/ResultReceiver;

    invoke-direct {p0}, Lo/AudioAttributesImplApi21Parcelizer$read;-><init>()V

    return-void
.end method


# virtual methods
.method public final write(ILandroid/os/Bundle;)V
    .registers 5

    .line 71
    iget-object v0, p0, Landroid/support/v4/os/ResultReceiver$read;->write:Landroid/support/v4/os/ResultReceiver;

    iget-object v0, v0, Landroid/support/v4/os/ResultReceiver;->IconCompatParcelizer:Landroid/os/Handler;

    if-eqz v0, :cond_15

    .line 72
    iget-object v0, p0, Landroid/support/v4/os/ResultReceiver$read;->write:Landroid/support/v4/os/ResultReceiver;

    iget-object v0, v0, Landroid/support/v4/os/ResultReceiver;->IconCompatParcelizer:Landroid/os/Handler;

    new-instance v1, Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;

    iget-object p0, p0, Landroid/support/v4/os/ResultReceiver$read;->write:Landroid/support/v4/os/ResultReceiver;

    invoke-direct {v1, p0, p1, p2}, Landroid/support/v4/os/ResultReceiver$IconCompatParcelizer;-><init>(Landroid/support/v4/os/ResultReceiver;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 74
    :cond_15
    iget-object p0, p0, Landroid/support/v4/os/ResultReceiver$read;->write:Landroid/support/v4/os/ResultReceiver;

    invoke-virtual {p0, p1, p2}, Landroid/support/v4/os/ResultReceiver;->AudioAttributesCompatParcelizer(ILandroid/os/Bundle;)V

    return-void
.end method
