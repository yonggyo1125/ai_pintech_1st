import JoinForm from '../components/JoinForm'
import { processJoin } from '../services/actions'

const JoinContainer = () => {
  return <JoinForm formAction={processJoin} />
}

export default JoinContainer
