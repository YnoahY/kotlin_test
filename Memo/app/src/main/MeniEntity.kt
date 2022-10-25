import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="memo")
class Memo(
    @PrimaryKey
    var id : Long?,
    var memo  String)
